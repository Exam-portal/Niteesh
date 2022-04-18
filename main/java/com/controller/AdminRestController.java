package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AdminService;
import com.model.Admin;

@RestController
public class AdminRestController {
	
	@Autowired
	AdminService service;
	
	
	
	@GetMapping("/view")
	public List <Admin>getAllTests()
	{
		
		 return service.findAllTest();
	}  
	
	
	@GetMapping("/login")
	public String login(@RequestBody Admin admin)
	{
		return service.login(admin);
	}
	
	
	@PostMapping("/ChangePassword")
	public String changePaasword(@RequestBody Admin admin)
	{
		service.changePassword(admin);
		return "password changed succesfully";
	}
	
	
	@PostMapping("/addTest")
	public ResponseEntity<?> addTest(@RequestBody Admin test)
	{
		service.add(test);
		return ResponseEntity.status(HttpStatus.OK).body("Test added succesfully");
	}
	
	
	@PostMapping("/addQuestionBank")
     public ResponseEntity<?> addQuestionBank(@RequestBody Admin test)
	{
		service.add(test);
		return ResponseEntity.status(HttpStatus.OK).body("QuestionBank Added successfully");
	}
	
	
	@PostMapping("/CreateTest")
	  public ResponseEntity<?> CreateTest(@RequestBody Admin test)
	    {
		
		service.CreateTest(3);
		return ResponseEntity.status(HttpStatus.OK).body("Test created successfully");
		}
	
	
     @PatchMapping("/updateTest")
	  public ResponseEntity<?> updateTest(@RequestBody Admin test)
     {
	  service.updateTest(test);
      return ResponseEntity.status(HttpStatus.OK).body("Test updated successfully");
	}
	
}
