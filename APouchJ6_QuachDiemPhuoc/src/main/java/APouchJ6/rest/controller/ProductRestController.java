package APouchJ6.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import APouchJ6.entity.SanPham;
import APouchJ6.service.SanPhamService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/products")
public class ProductRestController {
	@Autowired
	SanPhamService SPService;
	
	@GetMapping("{id}")
	public SanPham getOne(@PathVariable("id") Integer id) {
		return SPService.findById(id);
	}
}
