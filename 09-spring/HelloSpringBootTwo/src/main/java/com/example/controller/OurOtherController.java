package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OurOtherController {

	@GetMapping("/secondUri")
	public String myMethod() {
		return "done!";
	}
}
