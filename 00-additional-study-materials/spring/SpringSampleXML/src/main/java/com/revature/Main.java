package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.Jedi;
import com.revature.service.JediService;

public class Main {
	public static void main(String[] args) {
		//Needed to activate bean profile for primitive injection
		/* 
		 * To set up this in Tomcat for the future:
		 * 1) Run As -> Run Configurations.
		 * 2) Click the arguments tab.
		 * 3) Add -Dspring.profiles.active=jedis into the VM text field.
		 * 4) To set it up on a tomcat in an ec2 add spring.profiles.active=jedis to catalina.properties
		 * */
		System.setProperty("spring.profiles.active", "jedis");		
		
		//Pulling out Application Context.
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Getting JediService Bean with dependencies injected.
		JediService jediService = appContext.getBean("jediService", JediService.class);
		
		//Printing all jedis.
		System.out.println(jediService.getAllJedis());
		
		//Printing special jedi with primitive values injected.
		System.out.println(appContext.getBean("specialJedi", Jedi.class));
	}
}
