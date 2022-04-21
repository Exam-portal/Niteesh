package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.Admin1Service;
import com.model.Admin1;

@RestController
public class AdminRestController {
	
	@Autowired
	Admin1Service service;
	
	@GetMapping("/login")
	public String login(@RequestBody Admin1 admin) {
		return service.login(admin);
	}
	
	@PostMapping("/changePassword")
	public String changePassword(@RequestBody Admin1 admin) {
		service.changePassword(admin);
		return "password changed successfully";

}
	
}
