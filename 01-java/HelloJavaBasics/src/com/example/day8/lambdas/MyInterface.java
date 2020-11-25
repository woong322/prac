package com.example.day8.lambdas;

public interface MyInterface {

	//variable
	public static final int i=5;
	
	//abstract method
	void abstractMethod(String s);
	
	//default method
	public default void defaultMethod() {
		System.out.println("Default");
	}
	
	//static method
	public static void staticMethod() {
		System.out.println("Static");
	}
}
