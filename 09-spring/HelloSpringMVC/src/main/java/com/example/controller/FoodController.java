package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.FoodRepo;
import com.example.model.Food;

@Controller
@RequestMapping("/api")
public class FoodController {

	/////FIELDS
	private FoodRepo foodRepo;
	
	////CONSTRUCTORS
	public FoodController() {
	}

	@Autowired
	public FoodController(FoodRepo foodRepo) {
		this.foodRepo = foodRepo;
		helperIntialValues();
	}
	
	@GetMapping(value="/getAllFood")
	@ResponseBody
	//@RequestMapping(value="/getAllFood", method=RequestMethod.GET)
	public List<Food> getAllFoods(){
		return foodRepo.selectAll();
	}
	
	@PostMapping(value="/getFoodById")
	@ResponseBody
	//@RequestMapping(value="/getFoodById", method=RequestMethod.POST)
	public Food getFoodById(@RequestParam("id") int id) {
		
		return foodRepo.selectById(id);
	}
	
	
	private void helperIntialValues() {
		Food food1 = new Food("Buffalo Chicken", 0);
		Food food2 = new Food("Orange Chicken", 600.5);
		Food food3 = new Food("Sesame Chicken", 1000.0);
		Food food4 = new Food("General Tso Chicken", 800.0);
		Food food5 = new Food("Lemon Chicken", 200.0);
		
		foodRepo.insert(food1);
		foodRepo.insert(food2);
		foodRepo.insert(food3);
		foodRepo.insert(food4);
		foodRepo.insert(food5);
	}
	
	
}
