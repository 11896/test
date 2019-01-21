package com.example.snug.hello.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/")
		public String Home() {
		String message = "Welcome to Spring Boot";
		return message;		
	}
}


