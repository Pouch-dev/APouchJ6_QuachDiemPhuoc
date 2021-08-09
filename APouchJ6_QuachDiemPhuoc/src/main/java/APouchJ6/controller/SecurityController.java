package APouchJ6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import APouchJ6.entity.NguoiDung;
import APouchJ6.service.NguoiDungService;
import APouchJ6.service.UserService;

@Controller
public class SecurityController {
	
	@Autowired
	private NguoiDungService nguoidungService;
	
	
	@RequestMapping("/security/login/form")
	public String loginForm(Model model) {
		model.addAttribute("ms", "Vui lòng đăng nhập!");
		model.addAttribute("user", new NguoiDung());
		return "login/form";
	}
	
	@RequestMapping("/security/login/success")
	public String loginSuccess(Model model) {
		model.addAttribute("ms", "Đăng nhập thành công");
		model.addAttribute("user", new NguoiDung());
		return "login/form";
	}
	
	@RequestMapping("/security/login/error")
	public String loginError(Model model) {
		model.addAttribute("ms", "Sai thông tin đăng nhập!");
		model.addAttribute("user", new NguoiDung());
		return "login/form";
	}
	
	@RequestMapping("/security/resigter/success")
	public String resigterSuccess(NguoiDung user, Model model) {
		if (user.getTenTK() != "" && user.getMatKhau() != "") {
			model.addAttribute("user", new NguoiDung());
			model.addAttribute("ms", "Đăng kí thành công");
		}else {
			return "redirect:/security/resigter/error";
		}
			nguoidungService.save(user);
			return "login/form";
	}
	
	@RequestMapping("/security/resigter/error")
	public String resigterError(Model model) {
		model.addAttribute("user", new NguoiDung());
		model.addAttribute("ms", "Đăng kí thất bại");
		return "login/form";
	}
	
	@RequestMapping("/security/unauthorited")
	public String loginUnauthorited(Model model) {
		model.addAttribute("ms", "Bạn không có quyền truy cập");
		model.addAttribute("user", new NguoiDung());
		return "login/form";
	}
	
	@RequestMapping("/security/logout/success")
	public String logoutSuccess(Model model) {
		model.addAttribute("ms", "Đăng xuất thành công!");
		model.addAttribute("user", new NguoiDung());
		return "login/form";
	}

	@Autowired
	UserService userService;
	
	@RequestMapping("/oauth2/login/success")
	public String success(Model model, OAuth2AuthenticationToken oauth2) {
		model.addAttribute("ms", "Đăng nhập thành công");
		model.addAttribute("user", new NguoiDung());
		userService.loginFromOAuth2(oauth2);
		return "login/form";
	}
}
