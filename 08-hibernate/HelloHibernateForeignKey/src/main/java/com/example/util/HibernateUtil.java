package com.example.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf=
			new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
	
	//OUR GLOBAL SESSION OBJECT!!!
	private static Session ses;
	
	public static Session getSession() {
		//return sf.openSession();
		
		if(ses==null)
			ses=sf.openSession();
		
		return ses;
	}
	
	public static void closeSession() {
		ses.close(); //session
		ses=null;
		sf.close();//session factory
		/*
		 * this is to be called at the end of your application
		 */
	}
	
}
