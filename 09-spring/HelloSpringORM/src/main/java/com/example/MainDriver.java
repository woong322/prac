package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.FoodRepo;
import com.example.model.Food;

public class MainDriver {

	public static ApplicationContext appContext=
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static FoodRepo foodRepo = appContext.getBean("foodRepo", FoodRepo.class);
	
	public static void main(String[] args) {
		insertInitialValues();
		
		System.out.println("All our foods: \n"+foodRepo.selectAll());

	}

	private static void insertInitialValues() {
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
