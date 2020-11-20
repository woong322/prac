package com.example.day5.encapsulation;

public class Food {

	String[] ourFieldArray = {"equal to", "our various", "fields", "and so on"};
	//private String name;
	//private String recipe;
	//private int calories;
	//and 37 more fields
	
	
	
	///GETTERS & SETTERS
	//			aka     ACCESSORS & MUTATORS
	
	public String getName() {
		//THIS is a getter...by convention it is named		 [datatype] get[VariName]() { }
		//return name;
		
		return ourFieldArray[0];
	}
	
	public void setName(String name) {
		//THIS  is a setter...by convention it is named		 void set[VariName]([datatype] [variname]) { }
		//this.name = name;
		
		this.ourFieldArray[0] = name;
	}
}
