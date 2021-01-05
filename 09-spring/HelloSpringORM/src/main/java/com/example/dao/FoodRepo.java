package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Food;

@Repository("foodRepo")
@Transactional //this line modularizes the @Transactional annotation for the entire class
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
	//@Transactional
	public void insert(Food food) {
//		//basic session logic
//		Session ses = sesFact.openSession();
//		Transaction tx = ses.beginTransaction();
//		
//		//business logic
//		ses.save(food);
//		
//		//basic session logic
//		tx.commit();
//		ses.close();
		
		sesFact.getCurrentSession().save(food);
	}
	
	//@Transactional
	public Food selectById(int id) {
//		//basic session logic
//		Session ses = sesFact.openSession();
//		
//		//business logic
//		Food food = ses.get(Food.class, id);
//		
//		//basic session logic
//		ses.close();
//		
//		return food;
		
		return sesFact.getCurrentSession().get(Food.class, id);
	}
	
	//@Transactional
	public List<Food> selectAll() {
//		//basic session logic
//		Session ses = sesFact.openSession();
//		
//		//business logic
//		List<Food> foodList = ses.createQuery("from Food", Food.class).list();
//		
//		//basic session logic
//		ses.close();
//		
//		return foodList;
		
		return sesFact.getCurrentSession().createQuery("from Food", Food.class).list();
	}
	
}
