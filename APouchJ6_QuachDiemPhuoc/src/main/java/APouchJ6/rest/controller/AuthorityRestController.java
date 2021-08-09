package APouchJ6.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import APouchJ6.entity.ThamQuyen;
import APouchJ6.service.ThamQuyenService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/authorities")
public class AuthorityRestController {
	@Autowired
	ThamQuyenService TQService;
	
	@GetMapping
	public List<ThamQuyen> findAll(@RequestParam("admin")Optional<Boolean> admin){
		if(admin.orElse(false)) {
			return TQService.findAuthoritiesOfAdministrators();
		}
		return TQService.findAll();
	}
	
	@PostMapping
	public ThamQuyen post(@RequestBody ThamQuyen auth) {
		return TQService.create(auth);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id")Integer id) {
		TQService.delete(id);
	}
}
