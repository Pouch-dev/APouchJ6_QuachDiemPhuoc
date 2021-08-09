package APouchJ6.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import APouchJ6.entity.NguoiDung;
import APouchJ6.service.NguoiDungService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
	@Autowired
	NguoiDungService nguoiDungService;
	
	@GetMapping
	public List<NguoiDung> getAccount(@RequestParam("admin")Optional<Boolean> admin){
		if(admin.orElse(false)) {
			return nguoiDungService.getAdministrator();
		}
		return nguoiDungService.findAll();
	}
}
