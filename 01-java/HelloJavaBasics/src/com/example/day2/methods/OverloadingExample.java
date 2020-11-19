package com.example.day2.methods;

/*
 * what is overloading?
 * 	two or more methods with the same name BUT different parameters.
 * 
 * you may want to overload for self-documenting reasons, readability, and to create an affordance
 * 		drawRectangle(int x, int y, int height, int width);
 * 		drawRectangle(int x, int y, int height, int width, double alphaTransparency);
 * 
 * there are THREE WAYS to properly overload a method:
 * 	-change the parameter DATATYPES
 * 	-change the NUMBER of parameters
 * 	-change the ORDER of parameter datatypes
 * 
 * overloading is a type of polymorphism. More specifically it is compile time polymorphism
 */
public class OverloadingExample {
	public static void main(String[] argsaweuifhaufhsuifhauih) {
//		ourMethod(0, 0.11);
		//ourMethod('T');
		ourMethod('c',6,23,6,234,5,2,2,5,6);
		ourMethod('t', 234,277,3,25);
		
		OverloadingExample myOE = new OverloadingExample();
		myOE.ourMethod(7);
	}
	
	static void ourMethod(char c, int k, int... i /* , int i2 */    /* , double... d */) {
		//this is called "varargs"
		System.out.println("wait....what is happening? panic!");
		
		System.out.println(i);
		System.out.println(i.length); //"i" is an array
		
		//ignore this syntax for now...we'll do an example of it later
		for(int temp: i) {
			System.out.println(temp);
		}
	}
	
	
	/* static */void ourMethod(int i) {
		System.out.println("in first");
	}
	
	
	static int ourMethod(int i, double d) {	//adding or removing parameters WILL overload
		System.out.println("in second");
		return 7;	//btw, yes you MAY change the return type of the method
			//BUT it isn't the REASON its overloaded
	}
	
	static void ourMethod() {					//<---removes
		System.out.println("in first");
	}
	
	static void ourMethod(char c) {	//changing the datatypes of parameters WILL overload
		System.out.println("in third");
	}
	
	
	static int ourMethod(double d, int i) {	//changing the ORDER of parameters WILL overload
		System.out.println("in second");
		return 7;
	}
	
//	static void ourMethod(int k) {	//changing the NAME of the variable does not properly overload
//		System.out.println("in first");
//	}
	
//	static int ourMethod(int i) {	//changing the return type DOESN'T overload a method
//		System.out.println("in third");
//		return 7;
//	}
	
}
