package APouchJ6.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@GetMapping()
	public List<SanPham> getAll(){
		return SPService.findAll();
	}
	
	@GetMapping("{id}")
	public SanPham getOne(@PathVariable("id") Integer id) {
		return SPService.findById(id);
	}
	
	@PostMapping()
	public SanPham create(@RequestBody SanPham sanpham) {
		return SPService.create(sanpham);
	}
	
	@PutMapping("{id}")
	public SanPham update(@PathVariable("id") Integer id, @RequestBody SanPham sanpham) {
		return SPService.update(sanpham);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		 SPService.delete(id);
	}
}
