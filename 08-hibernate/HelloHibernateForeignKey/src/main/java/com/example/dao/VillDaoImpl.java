package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.example.model.SuperVillain;
import com.example.util.HibernateUtil;

/*
 * Session methods:
 * 
 * save() and persist()			results in a sql insert
 * update() and merge()			results in a sql update
 * delete()						results in a sql delete
 * saveOrUpdate()				results in either a sql insert or update (depending)
 * get() and load()				results in a sql select
 * 
 * 
 * But HOW do we create complex queries in Hibernate?
 * 
 * 	Three ways to create complex queries:
 * 	-Hibernate Query Language (HQL)
 * 		>>create complex queries using a combination of OOP and Native SQL
 * 		>>HQL targets java objects NOT SQL TABLES
 * 	-Criteria API
 * 		>>creates complex queries fully PROGRAMMATICALLY. That is, it does so using
 * 				ONLY OOP principles. NO SQL INVOLVED
 * 		>>criteria targets java objects NOT SQL TABLES.
 * 	-Native SQL
 * 		>>creates complex queries by using plain old SQL queries.
 * 		>>Native SQL targets SQL tables NOT java objects
 * 		>>AVOID using Native SQL wherever possible BECAUSE Native SQL is tightly coupling your
 * 		code base to a specific type of DB. 
 */

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
//		ses.close();
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
//		ses.close();

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
//		ses.close();

	}

	@Override
	public SuperVillain selectById(int id) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();

		// NOW, let's get to our business logic
		SuperVillain supe = ses.get(SuperVillain.class, id);

		// boilerplate session end, no specific business logic for my CRUD operation
//		ses.close();
		
		return supe;
	}

	@Override
	public SuperVillain selectByName(String name) {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();
		
		//HQL- HIBERNATE QUEERY LANGUAGE
//		List<SuperVillain> villList = ses.createQuery("from SuperVillain where"
//				+ " name='"+name+"'", SuperVillain.class).list();
		
		
		//CRITERIA   (note: criteria is deprecated, you should look into "CriteriaBuilder")
//		List<SuperVillain> villList = ses.createCriteria(SuperVillain.class)
//				.add(Restrictions.ilike("name", name)).list();
		//I normally use the deprecated version for the demo BECAUSE the CriteriaBuilder
		//  takes like 7lines of code to do the same thing.
		
		
		//NATIVE SQL
		List<SuperVillain> villList = ses.createNativeQuery("select * from Hibernate_SuperVillain "
				+ "where name='"+name+"'", SuperVillain.class).list();
		
		
		
		// boilerplate session end, no specific business logic for my CRUD operation
//		ses.close();
		
		if(villList.size()==0) {
			System.out.println("PANIC!!!!!");
			return null;
		}
		
		return villList.get(0);
	}

	@Override
	public List<SuperVillain> selectAll() {
		// boilerplate session start, no specific business logic for my CRUD operation
		Session ses = HibernateUtil.getSession();

		// NOW, let's get to our business logic
		//using HQL
		List<SuperVillain> villList=
				ses.createQuery("from SuperVillain", SuperVillain.class).list();

		// boilerplate session end, no specific business logic for my CRUD operation
//		ses.close();
		
		return villList;
	}

}
