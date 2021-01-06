package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.SessionUser;

@RestController //@RestController makes it so that you DON'T need @ResponseBody, it'll assume you're
// already using JSONs in your response
//@Controller
public class SessionController {
	
	/*
	 * (look into Spring Filters - they are middleware)
	 * 
	 * Spring can inject a variety of object ins your controlelr methods
	 * ASSUMING you declare a parameter for said object. For example:
	 * HttpSession, HttpServletRequest, HttpServletResponse, ModelAndView, etc
	 */

	@GetMapping(value="/getName")
	public /* @ResponseBody */ SessionUser getLoggedInName(HttpSession session) {
		System.out.println("in the getName method");
		
		SessionUser currentUser = (SessionUser) session.getAttribute("loggedInUser");
		
		System.out.println("\n\n\n");
		return currentUser;
	}
	
	@PostMapping(value="/login")
	public /* @ResponseBody */ String login(HttpSession session, @RequestBody SessionUser currentUser) {
		System.out.println("in the login method");
		
		session.setAttribute("loggedInUser",  currentUser);
		System.out.println("\n\n\n");
		return "Login has gone according to plan";
	}
	
	@GetMapping(value="/logout")
	public /* @ResponseBody */ String logout(HttpSession session) {
		System.out.println("in the logout method");
		session.invalidate();
		
		System.out.println("\n\n\n");
		return "Sayonara";
	}
}
