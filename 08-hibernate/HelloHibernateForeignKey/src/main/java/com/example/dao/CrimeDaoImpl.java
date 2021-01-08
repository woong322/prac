package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Crime;
import com.example.util.HibernateUtil;

public class CrimeDaoImpl {

	public void insert(Crime crime) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.save(crime);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
//		ses.close();
	}

	public void update(Crime crime) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.update(crime);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
//		ses.close();

	}

	public void delete(Crime crime) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();

		// NOW, let's get to our business logic
		ses.delete(crime);

		// boilerplate session end, no specific business logic for my CRUD operation
		tx.commit();
//		ses.close();

	}

	public Crime selectById(int id) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();

		// NOW, let's get to our business logic
		Crime crime = ses.get(Crime.class, id);

		// boilerplate session end, no specific business logic for my CRUD operation
//		ses.close();
		
		return crime;
	}

	public List<Crime> selectAll() {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();

		// NOW, let's get to our business logic
		//using HQL
		List<Crime> crimeList=
				ses.createQuery("from Crime", Crime.class).list();

		// boilerplate session end, no specific business logic for my CRUD operation
//		ses.close();
		
		return crimeList;
	}
}
