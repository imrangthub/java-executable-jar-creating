package com.imranmadbar.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "Hello World Java ( Spring Boot ) Web Application.";
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Home, Java ( Spring Boot ) Web Application.";
	}
	
	
	
}
