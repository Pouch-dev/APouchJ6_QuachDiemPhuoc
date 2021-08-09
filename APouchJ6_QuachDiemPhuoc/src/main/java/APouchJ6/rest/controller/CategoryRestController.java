package APouchJ6.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import APouchJ6.entity.LoaiSanPham;
import APouchJ6.entity.NhomSanPham;
import APouchJ6.service.LoaiSanPhamService;
import APouchJ6.service.NhomSanPhamService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class CategoryRestController {
	@Autowired
	LoaiSanPhamService SPService;
	@Autowired
	NhomSanPhamService NSPService;
	
	@GetMapping("/categories")
	public List<LoaiSanPham> getAllL(){
		return SPService.findAll();
	}

	@GetMapping("/groupprod")
	public List<NhomSanPham> getAllNSP(){
		return NSPService.findAll();
	}
}
