package com.example.day4.inheritance;

public class Chimp extends Monkey{

	String gender = "female";
	int numOfHands = 8; //<--shadowed variable
	
	/////CONSTRUCTOR
	public Chimp() {
		//super(); //the first implicit line of any constructor is super() (assuming you gave no other commands)
		//super(5);
		//System.out.println("in chimp constructor");
	}
	
	public Chimp(String gender, int numOfHands) {
		//the gender and numOfHands from the methods scope will overshadow the instance scoped variables
		// so to access the instance scoped variables you'll need to use the "this" keyword
		this.gender = gender;
		this.numOfHands = numOfHands;
	}
	
	/////METHODS
	
	void eatBanana() {
		System.out.println("chimp: ohm nom nom");
	}
	
	void printParentState(){
		System.out.println("print numOfHands (without super keyword): "+numOfHands);
		//the "this" keyword points to MYSELF, MY instance....
		System.out.println("print this.numOfHands: "+this.numOfHands);
		//the "super" keyword points to my PARENT'S members. (the parent members that exist within THIS instance)
		System.out.println("print super.numOfHands: "+super.numOfHands);
	}
	
	@Override
	void makeNoise() {
		super.makeNoise(); //you can even use "this" and "super" with methods
		System.out.println("make chimp noises, whatever that is");
		//super.makeNoise();
		//this.printParentState();
	}
	
}
