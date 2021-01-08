package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.VillService;
import com.example.service.VillServiceImpl;

/*
 * What is ApplicationContext?
 * -ApplicationContext is a type of BeanFactory. (the BeanFactory IS Spring's IoC container)
 * -In other words, ApplicationContext is a child of BeanFactory
 * -ApplicationContext adds some additional functionality to the normal BeanFactory, for example:
 * 		-internalization and text messaging
 * 
 *  * Common Spring Exceptions:
 * 	BeanCreationException
 * 	NoSuchBeanDefinitionException,
 * 	UnsatisfiedDependencyException
 * 	XmlBeanDefinitionStoreException
 * 	NoUniqueBeanDefiniteionException
 */
public class MainDriver {
	
	//let's start Spring's IoC container. This IS Spring....
	//Again, the ApplicationContext IS Spring's IoC container.
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	

	//WITHOUT Dependency Injection
	//the "new" keyword TIGHTLY COUPLES this class to a SPECIFIC object.
	//you NEVER want to TIGHTLY COUPLE your DEPENDENCIES.
	//private static VillService villServ = new VillServiceImpl();
	
	//WITH Dependency Injection
	private static VillService villServ;
	
	public static void main(String[] args) {
		
		villServ = appContext.getBean("villServFIRST", VillService.class);
		villServ = appContext.getBean("villServFIRST", VillService.class);
		villServ = appContext.getBean("villServFIRST", VillService.class);
		villServ = appContext.getBean("villServFIRST", VillService.class);
		villServ = appContext.getBean("villServFIRST", VillService.class);
		//new VillServiceImpl();
		
		System.out.println(villServ.getAllVills());

		System.out.println("Instance Counter: "+VillServiceImpl.howManyServicesCreated);
		System.out.println("end of program");
	}

}
