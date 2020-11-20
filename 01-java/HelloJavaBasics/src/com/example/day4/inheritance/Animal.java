package com.example.day4.inheritance;

public class Animal {

	/////////STATE    aka Fields
	boolean isAlive = true;
	int weight = 100;
	int height = 12;
	int speed = 0;
	
	////////BEHAVIOR   aka methods
	void breathe() {
		System.out.println("breathe in and out");
	}
	
	void speedUp() {
		speed+=2;
	}
	
	void makeNoise() {
		System.out.println("animal noises!!!!");
	}
	
	static void ourStaticMethod() {
		System.out.println("static method from animal class");
	}
	
	public Animal(){
		super();
		//System.out.println("in animal constructor");
	}
}
