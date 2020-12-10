package com.example.directservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.MyCustomStatusMessage;
import com.example.model.SuperVillain;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("In DirectServlet, doGet");
		
		/*
		 * the default content type is text/html
		 * so the following line is redundant
		 */
		//res.setContentType("text/html");
		
		/*
		 * What is the PrintWriter object?
		 * 	I'ts an object used to DIRECTLY respond to the client
		 */
		PrintWriter printer = res.getWriter();
		printer.println("<html><body><h1>HELLO FROM MY SERVLET!!!!</h1></body></html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("In DirectServlet, doPost");	
		
		//////////////Let's see how to SEND a JSON
		
		//this line is general core java
		//NORMALLY, you would get this information from somewhere like your DB
		SuperVillain asura = new SuperVillain("Asura","Hair Armament", 200_000);
		
		//servlet logic
		res.setContentType("application/json");
		
		PrintWriter printer = res.getWriter();
		
		//the "new ObjectMapper" stuff is jackson databind at work
		printer.write(new ObjectMapper().writeValueAsString(asura));
	}
	
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//////////////Let's see how to RECEIVE a JSON
		
		System.out.println("In DirectServlet, doPut");
		
		resp.setContentType("application/json");
		
		//btw, how do I send a status code?
		//resp.setStatus(418);
		//resp.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		resp.setStatus(HttpServletResponse.SC_CREATED);
		
		//let's ready a JSON from the user
		ObjectMapper mapper = new ObjectMapper();
		SuperVillain myVill = mapper.readValue(req.getInputStream(), SuperVillain.class);
		
		//we'll print the JSON so we can see if the read was successful
		System.out.println(myVill);
		
		//let's send the user a status message to let them know everything went okay
		MyCustomStatusMessage myMessage = new MyCustomStatusMessage("Villain Received", "And contained");
		resp.getWriter().write(new ObjectMapper().writeValueAsString(myMessage));
	}

	
}





