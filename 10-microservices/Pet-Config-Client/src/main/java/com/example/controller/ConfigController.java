package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	/*
	 * @Value retrieves config attributes from the config files. This @Value
	 * is retrieving an attribute called "message"
	 * 
	 * OBVIOUSLY in our config files "message" isn't an attribute. Using
	 * "message: ourString" we can dynamically create a new config AND
	 * set its value equal to "ourString"
	 */
	@Value("${message: You are Umasou!}")
	private String configMessage;
	
	@GetMapping("/test")
	public String ourConfigExamples() {
		return configMessage;
	}
}
