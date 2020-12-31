package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.SuperPrison;
import com.example.util.HibernateUtil;

public class SuperPrisonDaoImpl {

	public void insert(SuperPrison superPrison) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.save(superPrison);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
//		ses.close();
	}

	public void update(SuperPrison superPrison) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.update(superPrison);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
//		ses.close();

	}

	public void delete(SuperPrison superPrison) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.delete(superPrison);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
//		ses.close();

	}

	public SuperPrison selectById(int id) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();

		// NOW, let's get to our business logic
		SuperPrison superPrison = ses.get(SuperPrison.class, id);

		// boilerplate session end, no specific business logic for my CRUD operation
//		ses.close();
		
		return superPrison;
	}

	public List<SuperPrison> selectAll() {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();

		// NOW, let's get to our business logic
		//using HQL
		List<SuperPrison> superPrisonList=
				ses.createQuery("from SuperPrison", SuperPrison.class).list();

		// boilerplate session end, no specific business logic for my CRUD operation
//		ses.close();
		
		return superPrisonList;
	}
}
