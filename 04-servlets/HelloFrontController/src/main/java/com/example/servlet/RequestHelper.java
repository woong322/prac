package com.example.servlet;

import javax.servlet.http.HttpServletRequest;

import com.example.controller.HomeController;
import com.example.controller.LoginController;

public class RequestHelper {

	public static String process(HttpServletRequest request) {
		System.out.println("\t\tIn RequestHelper");
		System.out.println(request.getRequestURI());
		
		
		switch(request.getRequestURI()) {
		case "/HelloFrontController/forwarding/login":
			System.out.println("case1");
			return LoginController.login(request);
		case "/HelloFrontController/forwarding/home":
			System.out.println("case 2");
			return HomeController.home(request);
			default:
				System.out.println("bad checkpoint");
				return "/resources/html/badlogin.html";
		}
	}

}
