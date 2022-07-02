package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Saying hello");
		return "Hello";
	}
	

}
