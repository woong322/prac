package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.FoodRepo;
import com.example.model.Food;

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
	
	@RequestMapping(value="/getAllFood", method=RequestMethod.GET)
	public @ResponseBody List<Food> getAllFoods(){
		return foodRepo.selectAll();
	}
	
	public Food getFoodById(int id) {
		return foodRepo.selectById(id);
	}
	
	
}
