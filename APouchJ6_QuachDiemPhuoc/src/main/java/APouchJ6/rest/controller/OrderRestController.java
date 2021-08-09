package APouchJ6.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import APouchJ6.entity.DonHang;
import APouchJ6.service.DonHangService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderRestController {
	@Autowired
	DonHangService DHService;
	
	@PostMapping()
	public DonHang create(@RequestBody JsonNode orderData) {
		return DHService.create(orderData);
	}
}
