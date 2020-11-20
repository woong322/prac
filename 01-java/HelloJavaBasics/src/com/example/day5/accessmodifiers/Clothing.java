package com.example.day5.accessmodifiers;

class A{}
class B{}

/*
 * a file can have one class that is public, everything else will be default.
 * Also the one public class MUST have the same name as the file name
 */
public class Clothing {

	public String type = "Shirt";
	protected String material = "Cotton";
	String color = "red";
	private int cost = 500;
	
	
	//methods can also have access modifiers
	private void printer() {
		//SIMULATING THE CLASS ITSELF
		
		System.out.println(type);
		System.out.println(material);
		System.out.println(color);
		System.out.println(cost);
	}
	
	//constructors can also have access modifiers
	public Clothing() {
	}
	
	private Clothing(int i) {
		//yes you can have a private constructor
	}
	
//	private{
//		//no, you cannot put access modifiers on initializer blocks	
//	}
}
