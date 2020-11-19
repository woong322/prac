package com.example.day4.inheritance;

public class Chimp extends Monkey{

	String gender = "female";
	
	void eatBanana() {
		System.out.println("chimp: ohm nom nom");
	}
	
	public Chimp() {
		//super(); //the first implicit line of any constructor is super() (assuming you gave no other commands)
		//super(5);
		System.out.println("in chimp constructor");
	}
}
