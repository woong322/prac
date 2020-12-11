package com.example.json;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.SuperVillain;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PepperController {

	public static void pepperFinder(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException, IOException {
		/*
		 * THIS IS WHERE YOU'D GO TO THE DATABASE TO GET THE OBJECTS TO SEND TO THE CLIENT
		 */
		
		SuperVillain pepper = new SuperVillain("Pepper Jupiter", "Drowsy Fist", 120_000);
		
		response.getWriter().write(new ObjectMapper().writeValueAsString(pepper));
		
	}

}
