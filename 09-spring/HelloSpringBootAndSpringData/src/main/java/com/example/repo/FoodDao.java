package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Food;
										////	<theModel, thePK>
public interface FoodDao extends CrudRepository<Food,Integer> {

	public List<Food> findAll();
	public List<Food> findByOrderByDishName();
	public List<Food> findByOrderByDishNameDesc();
	
	public Food findByDishName(String dishName);
	public Food findbyCalories(double aifjaifj);
	public Food findByDishNameAndCalories(String afiajij, double aiofjaijfj);
	
	/*
	 * 
	 * 
	 * Look into @Query annotation
	 * 
	 * 
	 * 
	 * LOOK AT THE DOCUMENTATION FOR SPRING DATA HERE, IT HAS THE NAMING CONVENTIONS:
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
	 */
}
