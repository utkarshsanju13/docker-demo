package com.example.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserServiceController {

	@GetMapping("/test")
	public String getOrderTest() {
		
		return "Its a Basic Get Request for Demo purpose";
	}
	
}