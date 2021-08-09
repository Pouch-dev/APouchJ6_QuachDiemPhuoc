package APouchJ6.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Service;

import APouchJ6.dao.NguoiDungDAO;
import APouchJ6.entity.NguoiDung;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	NguoiDungDAO NguoiDungDAO;
	@Autowired
	PasswordEncoder pe;


	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			NguoiDung account = NguoiDungDAO.findById(username).get();
			//Tạo UserDetail từ Account
			String password = account.getMatKhau();
			String[] roles = account.getMaTK().stream()
					.map(au -> au.getVaiTro().getMaVT())
					.collect(Collectors.toList()).toArray(new String[0]);
			return User.withUsername(username)
				.password(pe.encode(password))
				.roles(roles).build();
		} catch (Exception e) {
			throw new UsernameNotFoundException(username + "not found");
		}
	}
	

	public void loginFromOAuth2(OAuth2AuthenticationToken oauth2) {
		// String fullname = oauth2.getPrincipal().getAttribute("name");
		String email = oauth2.getPrincipal().getAttribute("email");
		String password = Long.toHexString(System.currentTimeMillis());
		
		UserDetails username = User.withUsername(email)
			.password(pe.encode(password)).roles("GUEST").build();
		Authentication auth = new UsernamePasswordAuthenticationToken(username, null, username.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(auth);
		//nới chứa toàn bộ thông tin Security *SecurityContextHolder*
	}
	
}
