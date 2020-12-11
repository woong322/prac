package com.example.controller;

import javax.servlet.http.HttpServletRequest;

public class LoginController {

	public static String login(HttpServletRequest request) {
		/*
		 * route guarding:
		 * 
		 * you may do stuff like "check if the user has an admin token in their session",
		 * "check if they are using the correct Http method",
		 * etc
		 */
		if(!request.getMethod().equals("POST")) {
			return "/index.html";
		}
		
		//extracting the form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//check to see if the user has the correct username and password
		if(!(username.equals("mac") & password.equals("cheese"))) {
			//you'll actually go to the database to get the credentials, don't hardcode them
			return "/forwarding/incorrectcredentials";
		}else {
			//you probably wil have a user object that you put into the session
			// that contains the username & password...this is just an example
			request.getSession().setAttribute("loggedusername", username);
			request.getSession().setAttribute("loggedpassword", password);
			
			return "/forwarding/home";
		}
	}

}
