package com.example.json;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.SuperVillain;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRequestHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException, IOException {
		System.out.println(request.getRequestURI());
		
		switch(request.getRequestURI()) {
		case "/HelloFrontController/json/apple":
			AppleController.appleFinder(request, response);
			break;
		case "/HelloFrontController/json/pepper":
			PepperController.pepperFinder(request, response);
			break;
			default:
				System.out.println("issue!!!");
				SuperVillain badAsk = new SuperVillain(null, null, -1);
				
				response.getWriter().write(new ObjectMapper().writeValueAsString(badAsk));
				
		}
		
	}

}
