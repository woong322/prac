package com.example.day4.inheritance;

public class Monkey extends Animal{

	int numOfHands = 4;
	
	public Monkey() {
		//super(); //the first implicit line of any constructor is super()
				//UNLESS you manually call a different constructor
				//the "super" keyword in this context calls your PARENT'S constructors
		this(17); //the "this" keyword in this context calls YOUR other constructors
		System.out.println("in monkey constructor");
		
		//super
	}
	
	public Monkey(int startingSpeed) {
		//super();
		//this();
		speed= startingSpeed;
		System.out.println("in monkey SECOND constructor");
	}
}
