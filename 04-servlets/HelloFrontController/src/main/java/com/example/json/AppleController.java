package com.example.json;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.SuperVillain;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppleController {

	public static void appleFinder(HttpServletRequest request, HttpServletResponse response)
			throws JsonProcessingException, IOException {
		/*
		 * THIS IS WHERE YOU'D GO TO THE DATABASE TO GET THE OBJECTS TO SEND TO THE CLIENT
		 */
		
		SuperVillain apple = new SuperVillain("Apple Jupiter", "Flesh Fruit", 120_000);

		response.getWriter().write(new ObjectMapper().writeValueAsString(apple));

	}

}
