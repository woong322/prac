package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OurController {

	@GetMapping("/tester.app")
	public String getStuff() {
		return "Spring Boot...are you actually working?";
	}
}
