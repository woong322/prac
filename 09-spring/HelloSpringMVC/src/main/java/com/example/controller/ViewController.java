package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //don't use @RestController here, else it'll put @ResponseBody on all methods
public class ViewController {

	/*
	 * THIS IS A FORWARD
	 */
	@GetMapping(value="/nextPage")
	public String nextPage() {
		//return "/otherPage.html";
		//return "/mvcexample/api/getAllFood";
		//remember, you can NOT forward outside of the server
		
		//return "/resources/folder1/folder2/folder3/folder5/folder4/underground.html";
		return "derg";
	}
	
	/*
	 * THIS IS A REDIRECT
	 */
	@GetMapping(value="/nextPageAgain")
	public String nextPageAgain() {
		return "redirect: /HelloSpringMVC/otherPage.html";
		//return "redirect: https://www.google.com/";
		//return "redirect: /HelloSpringMVC/mvcexample/api/getAllFood";
	}
}
