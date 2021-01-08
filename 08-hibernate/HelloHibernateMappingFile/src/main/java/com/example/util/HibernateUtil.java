package com.example.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

//	private static SessionFactory sf=
//			new Configuration()
//				.configure("hibernate.cfg.xml")
//				.buildSessionFactory();
	
	private static Configuration conf = new Configuration()
			.configure("hibernate.cfg.xml");
	
	static {
		conf.setProperty("hibernate.connection.password", System.getenv("TRAINING_DB_PASSWORD"));
		conf.setProperty("hibernate.connection.url",
				"jdbc:postgresql://"+System.getenv("TRAINING_DB_URL")+
				"/Hibernate_SuperVillain");
	}
	
	private static SessionFactory sf = conf.buildSessionFactory();
	
	public static Session getSession() {
		return sf.openSession();
	}
	
}
