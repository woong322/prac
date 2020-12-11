package com.example.sessionservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.SuperVillain;

public class HelperSessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		System.out.println("In HelperSessionServlet, doGet");
		
		//SESSION CODE
		HttpSession session = req.getSession();
		SuperVillain villain = 
				(SuperVillain) session.getAttribute("currentVillain");
		
		//GENERAL SERVLET CODE
		PrintWriter printer = res.getWriter();
		printer.println("<html><body>");
		
		if(villain != null) {
			printer.println("We've captured the villain!");
			printer.println("<h1>Villain Name: "+villain.getName()+"</h1><br>");
			printer.println("<b>\tSuperPower: "+villain.getSuperpower()+"</b><br>");
			printer.println("<i>\tBounty: $"+ villain.getBounty()+"</i><br>");
		}else {
			printer.println("Can't find any villains........");
		}
		
		printer.println("</body></html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In HelperSessionServlet, doPost");
		
		//SESSION CODE
		HttpSession session = req.getSession();
		
		//THIS METHOD WILL DESTROY THE SESSION FOR THIS USER
		//you'll more than likely use this for your logout button
		session.invalidate();
	}
}
