package com.example.directservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	///////////////////////////////////////////////////
	/*
	 * FULL JDBC CONNECTION WITH YOR SERVLETS
	 */
	
	//(this would normally go into your dao layer)
	private static String url = "jdbc:postgresql://"+System.getenv("TRAINING_DB_URL")+
			"/"+System.getenv("TRAINING_DB_DATABASENAME");
	private static String username = System.getenv("TRAINING_DB_USERNAME");
	private static String password = System.getenv("TRAINING_DB_PASSWORD");
	
	//IF YOU WANT TO USE JDBC WITH A WAR PROJECT YOU NEED TO DO THE FOLLOWING:
	static { //(this would normally go into your dao layer)
        try {
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Static block has failed me");
        }
    }
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * I AM GOING TO SKIP THE SERVICE LAYER AND DAO LAYER for the saake of
		 * simplicity. In your project you're NOT ALLOWED to skip these layers.
		 */
		
		SuperVillain myVill = null;;
		//
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			String sql = "SELECT A.shuman_name, C.spower_name, A.bounty " + 
					"FROM superhumans A " + 
					"INNER JOIN shuman_spower_junction B " + 
					"ON A.shuman_id = B.my_shuman_id " + 
					"INNER JOIN superpowers C " + 
					"ON C.spower_id = B.my_spower_id " + 
					"WHERE A.shuman_name='Danny Boy'";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				myVill = new SuperVillain(rs.getString(1), rs.getString(2), rs.getInt(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		/////////////////
		///servlet logic
		
		resp.setContentType("application/json");
		PrintWriter printer = resp.getWriter();
		printer.write(new ObjectMapper().writeValueAsString(myVill));
	}

	
}





