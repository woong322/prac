package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.SuperVillain;
import com.example.util.HibernateUtil;

public class VillDaoImpl implements VillDao {

	@Override
	public void insert(SuperVillain superVillain) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.save(superVillain);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
		ses.close();
	}

	@Override
	public void update(SuperVillain superVillain) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.update(superVillain);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
		ses.close();

	}

	@Override
	public void delete(SuperVillain superVillain) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.delete(superVillain);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
		ses.close();

	}

	@Override
	public SuperVillain selectById(int id) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();

		// NOW, let's get to our business logic
		SuperVillain supe = ses.get(SuperVillain.class, id);

		// boilerplate session end, no specific business logic for my CRUD operation
		ses.close();
		
		return supe;
	}

	@Override
	public SuperVillain selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SuperVillain> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
