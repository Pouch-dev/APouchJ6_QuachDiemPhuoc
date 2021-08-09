package APouchJ6.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import APouchJ6.entity.SanPham;
import APouchJ6.service.SanPhamService;

@Controller
public class HomeController {
	@Autowired
	SanPhamService SPService;
	
	
	@RequestMapping("ApouchJ6/home")
	public String list(Model model, @RequestParam("cid")Optional<String> cid) {
		if(cid.isPresent()) {
			List<SanPham> listP = SPService.findByCateID(cid.get());
			model.addAttribute("items", listP);
		}else {
			List<SanPham> listP = SPService.findAll();
			model.addAttribute("items", listP);
		}
		return "layout/body_index";
	}
	
	@RequestMapping("ApouchJ6/profile")
	public String profile(Model model) {
		return "login/profileaccount";
	}
	
	
	@RequestMapping({"/admin", "/admin/home/index"})
	public String admin() {
		return "redirect:/admin/backend/index.html";
	}
	
	@RequestMapping("/product/list")
	public String show(Model model) {		
	List<SanPham> listP = SPService.findAll();
	model.addAttribute("items", listP);
		return "product/list";
	}
	
	@RequestMapping("/product/list/{id}")
	public String dtshow(Model model, @PathVariable("id")Integer id) {
		SanPham item = SPService.findById(id);
		model.addAttribute("item", item);
		return "product/list";
	}
	
	@RequestMapping("/product/detail/{id}")
	public String detail(Model model, @PathVariable("id")Integer id) {
		SanPham item = SPService.findById(id);
		model.addAttribute("item", item);
		return "layout/body_detail";
	}
}
