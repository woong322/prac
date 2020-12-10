package com.example.indirectservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * There are THREE ways a servlet can respond to an incoming request:
 * 
 * -Direct Response		(we use the PrintWriter object)
 * 	This happens when the servlet directly responds itself
 * 
 * -Forward		(1req, 1resp. Uses Request Dispatcher's .forward() to function)
 * 	>comes from the HttpServletRequest object.
 * 	>The servlet asks another servlet/resource (internal to your server) to assist with the response
 * 
 * -Redirect	(2req, 2resp. Use Response object's .sendRedirect() to function)
 * 	>comes from the HttpServletResponse object
 * 	>The servlet informs the client that it must go somewhere else to have the request handled
 */
public class IndirectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException{
		System.out.println("In IndirectServlet, doGet");
		
		//REDIRECTING
		//TWO requests, TWO responses
		//client is totally AWARE of the new resource/entity
		//res.sendRedirect("http://localhost:9001/HelloServlets/secondpage.html");
		//res.sendRedirect("http://localhost:9001/HelloServlets/direct");
		res.sendRedirect("https://www.google.com");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		System.out.println("In IndirectServlet, doPost");
		
		
		//FORWARDING
		//ONE request, ONE response
		//client is totally UNAWARE of the new resource/entity
		//RequestDispatcher redis = req.getRequestDispatcher("/secondpage.html");
		//RequestDispatcher redis = req.getRequestDispatcher("/direct");
		
		//note: forwarding does NOT work for resources external to the server
		RequestDispatcher redis = req.getRequestDispatcher("https://www.google.com");
		
		redis.forward(req, res);
	}
}
