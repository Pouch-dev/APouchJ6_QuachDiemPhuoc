package APouchJ6;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import APouchJ6.entity.NguoiDung;
import APouchJ6.service.NguoiDungService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	NguoiDungService nguoiDungService;
	@Autowired
	BCryptPasswordEncoder pe;
	
	
	//Cung cấp nguồn dữ liệu đăng nhập
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(username -> {
			try {
				NguoiDung user = nguoiDungService.findById(username);
				String password = pe.encode(user.getMatKhau());
				String[] roles = user.getMaTK().stream()
						.map(er -> er.getVaiTro().getMaVT())
						.collect(Collectors.toList()).toArray(new String[0]);
				return User.withUsername(username).password(password).roles(roles).build();
			} catch (Exception e) {
				throw new UsernameNotFoundException(username+"not found!");
			}
		});
	}
	
	//Cấu hình dữ liệu đăng nhập
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		//Cấu hình vai trò đăng nhập
		http.authorizeRequests()
			//.antMatchers("/order/**").authenticated()
			.antMatchers("/admin/**").hasAnyRole("STAFF","ADMIN")
			.antMatchers("/rest/authorites").hasRole("ADMIN")
			.anyRequest().permitAll();
		
		//Cấu hình form đăng nhập
		http.formLogin()
			.loginPage("/security/login/form")
			.loginProcessingUrl("/security/login")
			.defaultSuccessUrl("/security/login/success",false)
			.failureUrl("/security/login/error");
		
		//Oauth2 - Đăng nhập từ mạng xã hội
        http.oauth2Login()
	        .defaultSuccessUrl("/oauth2/login/success", true)
	        .failureUrl("/auth/login/error")
	        .permitAll()
	        .authorizationEndpoint()
	        .baseUri("/oauth2/authorization");
        
		//Cấu hình checkbox rememberMe
		http.rememberMe()
			.tokenValiditySeconds(86400);
		
		//Cấu hình lỗi truy xuất dữ liệu
		http.exceptionHandling()
			.accessDeniedPage("/security/unauthorited");
		
		//Cấu hình đăng xuất
		http.logout()
			.logoutUrl("/security/logout")
			.logoutSuccessUrl("/security/logout/success");
	}
	
	//Cơ chế mã hóa mật khẩu
	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//Cho phép truy xuất REST API từ bên ngoài (domain khác)
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(HttpMethod.OPTIONS,"/**");
	}
}
