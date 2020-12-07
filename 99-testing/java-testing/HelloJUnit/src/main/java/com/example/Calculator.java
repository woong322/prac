package com.example;

public class Calculator {
	
	int myState= 0;

	public int add(int x, int y) {
		return x+y;
	}
	
	public int subtract(int x, int y) {
		//cwobj.coworkersMethod1(); // <---when I call this method, Mockito had me the numbr 5
		//ocwobj.otherCoworkersMethod2();
		return x-y;
	}
	
	public int multiply(int x, int y) {
//		if(x==5)
//			return 50;
		return x*y;
	}
	
	public int divide(int x, int y) {
		return x/y;
	}
	
	public void throwingMethod() {
		myState++;
		throw new IllegalArgumentException();
	}
	
	public void timeMethod() {
		while(true) {
			
		}
	}
}
