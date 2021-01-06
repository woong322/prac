package com.example;

import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {

	public static void main(String[] args) {
		ApplicationContext appCon =
				new ClassPathXmlApplicationContext("trevin.xml");
		
		MyAppProxy app = appCon.getBean("appProxy", MyAppProxy.class);
		
		app.drawCartoon(5, 10, '5');
		app.drawAnime(5);
		app.drawNature();
		app.drawSpace();
		try {
			app.sculptPottery();
		} catch (Throwable e) {
			//e.printStackTrace();
		}

	}

}
