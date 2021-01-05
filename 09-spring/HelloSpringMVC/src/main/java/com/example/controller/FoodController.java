package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.dao.FoodRepo;

@Controller
public class FoodController {

	/////FIELDS
	private FoodRepo foodRepo;
	
	////CONSTRUCTORS
	public FoodController() {
	}

	@Autowired
	public FoodController(FoodRepo foodRepo) {
		this.foodRepo = foodRepo;
	}
	
	
}
