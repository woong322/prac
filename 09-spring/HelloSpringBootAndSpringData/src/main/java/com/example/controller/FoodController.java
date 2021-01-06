package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Food;
import com.example.repo.FoodDao;

@RestController
public class FoodController {
	
	private FoodDao foodDao;

	@GetMapping("/food")
	public Food findFood() {
		return null;
	}
	
	@GetMapping("/allFood")
	public List<Food> findAllFood(){
		return null;
	}
	
	
	
	/////////CONSTRUCTORS
	public FoodController() {
	}
	
	@Autowired
	public FoodController(FoodDao foodDao) {
		this.foodDao= foodDao;
	}

	///////////GETTERS AND SETTERS
	public FoodDao getFoodDao() {
		return foodDao;
	}

	public void setFoodDao(FoodDao foodDao) {
		this.foodDao = foodDao;
	}
	
	
}
