package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Food;
										////	<theModel, thePK>
public interface FoodDao extends CrudRepository<Food,Integer> {

	public List<Food> findAll();
}
