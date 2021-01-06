package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		ApplicationContext appCon =
				new ClassPathXmlApplicationContext("trevin.xml");
		
		MyAppProxy app = appCon.getBean("appProxy", MyAppProxy.class);
		
		app.drawCartoon('5', 5, 10);
		app.drawAnime(5);
		app.drawNature();
		app.drawSpace();
		app.sculptPottery();

	}

}
