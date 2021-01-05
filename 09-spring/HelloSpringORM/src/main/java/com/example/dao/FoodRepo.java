package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Food;

@Repository("foodRepo")
public class FoodRepo { //aka FoodDao

	//////FIELDS
	private SessionFactory sesFact; //this value is currently "null"
	
	//////CONSTRUCTORS
	public FoodRepo() {
	}
	
	@Autowired
	public FoodRepo(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}



	/////METHODS
	public void insert(Food food) {
		//basic session logic
		Session ses = sesFact.openSession();
		Transaction tx = ses.beginTransaction();
		
		//business logic
		ses.save(food);
		
		//basic session logic
		tx.commit();
		ses.close();
	}
	
	public Food selectById(int id) {
		//basic session logic
		Session ses = sesFact.openSession();
		
		//business logic
		Food food = ses.get(Food.class, id);
		
		//basic session logic
		ses.close();
		
		return food;
	}
	
	
	public List<Food> selectAll() {
		//basic session logic
		Session ses = sesFact.openSession();
		
		//business logic
		List<Food> foodList = ses.createQuery("from Food", Food.class).list();
		
		//basic session logic
		ses.close();
		
		return foodList;
	}
	
}
