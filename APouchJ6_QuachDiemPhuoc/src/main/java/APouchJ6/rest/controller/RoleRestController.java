package APouchJ6.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import APouchJ6.entity.VaiTro;
import APouchJ6.service.VaiTroService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/roles")
public class RoleRestController {
	@Autowired
	VaiTroService vaiTroService;
	
	@GetMapping
	public List<VaiTro> getAll(){
		return vaiTroService.findAll();
	}
}
