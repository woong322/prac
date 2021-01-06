package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Food;
import com.example.repo.FoodDao;

@RestController
public class FoodController {
	
	private FoodDao foodDao;
	
	@GetMapping("/food")
	public Food findFood(@RequestParam("target") String target,
			@RequestParam("targettwo") double targettwo) {
		//return foodDao.findByDishName(target);
		return foodDao.findByDishNameAndCalories(target,targettwo);
	}

	@PostMapping("/food")
	public String insertFood(@RequestBody Food food) {
		foodDao.save(food );
		return "success";
	}
	
	@GetMapping("/allFood")
	public List<Food> findAllFood(){
		return foodDao.findAll();
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
