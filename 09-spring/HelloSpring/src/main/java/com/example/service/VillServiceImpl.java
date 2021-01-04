package com.example.service;

import java.util.List;

import com.example.model.SuperVillain;
import com.example.repository.VillDao;
import com.example.repository.VillDaoImpl;

/*
 * EXPLANATION OF WHY THIS IS TIGHTLY COUPLED CODE:
 * 
 * Premise:
 * 		we have a "ChimpDaoImpl" class extends MonkeyDao
 * 		we have a "RhesusDaoImpl" class extends MonkeyDao <----this one is created later down the line
 * 
 * -----We'll need to have:
 * 
 * class MonkeyServiceImpl {
 * 		//we want the Service class to be able to work with any Monkey
 * 		MonkeyDao monkDao = new ChimpDaoImpl();
 * }
 * 
 * class MonkeyServiceTWOImpl {
 * 		//we want the Service class to be able to work with any Monkey
 * 		MonkeyDao monkDao = new RhesusDaoImpl();
 * }
 * 
 * 
 * INSTEAD let's do this:
 * 
 * class MonkeyServiceImpl{
 * 		//THIS version of MonkeyServiceImpl acts like a container for ANY type of MonkeyDao
 * 
 * 		MonkeyDao monkDao; //<--this is currently "null"
 * 
 * 
 * 		public MonkeyServiceImpl(MonkeyDao monkDao){
 * 			.......stuff......
 * 		}
 * 
 * 		setMonkDao(MonkDao monkDao){
 * 			........stuff.....
 * 		}
 * }
 * 
 * 
 * 
 * ^THIS is the idea of Dependency Injection (DI)
 * >>>>DI is a type of design pattern
 */
public class VillServiceImpl implements VillService {

	///////////STATIC MEMBERS
	public static int howManyServicesCreated=0;
	
	///////////INITIALIZER BLOCK (non-static)
	{
		howManyServicesCreated++;
	}
	
	
	///////////STATE
	
	//WITHOUT Dependency Injection.
	//the "new" keyword TIGHTLY COUPLES this class to a SPECIFIC object.
	//you NEVER want to TIGHTLY COUPLE your DEPENDENCIES.
	//private VillDao villDao = new VillDaoImpl();
	
	//WITH Dependency Injection
	private VillDao villDao; //right now this value is "null"
	private VillDao villDaoTwo;
	
	//////////BUSINESS LOGIC METHODS
	@Override
	public List<SuperVillain> getAllVills() {
		return villDao.selectAll();
	}
	
	//////////CONSTRUCTORS
	public VillServiceImpl() {
		System.out.println("In the service no arg constructor");
	}

	public VillServiceImpl(VillDao villDao) {
		super();
		System.out.println("In the service 1 arg constructor");
		this.villDao = villDao;
	}
	
	public VillServiceImpl(int i, VillDao villDao) {
		super();
		System.out.println("In the service 2 arg constructor: "+i);
		this.villDao = villDao;
	}
	
	////////GETTERS & SETTERS
	public VillDao getVillDao() {
		return villDao;
	}

	public void setVillDao(VillDao villDao) {
		System.out.println("In the service setter ONE");
		this.villDao = villDao;
	}

	public VillDao getVillDaoTwo() {
		return villDaoTwo;
	}

	public void setVillDaoTwo(VillDao villDaoTwo) {
		System.out.println("In the service setter TWO");
		this.villDaoTwo = villDaoTwo;
	}
	

}
