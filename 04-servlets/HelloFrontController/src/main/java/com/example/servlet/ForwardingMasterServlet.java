package com.example.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ForwardingMasterServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In FrontController doGet");
		
		//remember how forwarding works
		//request.getRequestDispatcher("a string goes here").forward(request, response);
		
		request.getRequestDispatcher(RequestHelper.process(request)).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In FrontController doPost");
		
		request.getRequestDispatcher(RequestHelper.process(request)).forward(request, response);
	}

}
