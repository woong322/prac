package com.example.day8.lambdas;

public class LambdaExample {

	public static void main(String[] args) {
		//We cannot instantiate an interface
		//MyInterface myInter = new MyInterface();

		///////////////ANONYMOUS INTEFACE IMPLEMENTATION
		//it's "anonymous" because it doesn't have a class name, only
		// a variable name.
		////////THESE ARE DIFFERENT THAN LAMBDAS
		MyInterface myInter = new MyInterface() {
			/*
			 * Essentially, this is defining a child class right here in-lie.
			 */
			private int otherNumber=7;
			
			@Override
			public void abstractMethod(String s) {
				System.out.println("in the method? " + s);
			}
			
			public void otherMethod() {
				/*
				 * you MAY add more functionality to the anonymous class
				 * like adding THIS method
				 */
			}
		};
		
		//myInter.abstractMethod("Look at me!");
		
		/////we can even override multiiple methods and create new methods
		MyOtherInterface myInter2 = new MyOtherInterface() {

			@Override
			public void abstractMethod1() {
				
			}

			@Override
			public void abstractMethod2() {
				
			}
			
			public int anotherVar;
			public void method3() {
			}
		};
		
		
		//////////////////////////LAMBDAS
		//a lambda is a disembodied anonymous method
		// Lambda expressions create an instance of a functional interface on
		//	the fly, using an anonymous method.
		
		MyInterface myInter3 = (String s) -> System.out.println(s);
								
		myInter3.abstractMethod("did this work?");
		
		MyInterface myInter5 = (String s)->{
			System.out.println("logic line 1");
			System.out.println("logic line 2");
			System.out.println(s);
		};
		
		myInter5.abstractMethod("You gotta follow through, Jerry");
		
		//let's try it with the second interface
		///MyInterface myInter6 = () -> System.out.println("Square your sholders, Jerry.");
		
		//you may NOT use lambdas with any type of interface. ONLY functional interfaces
		
		
		
		
		//use cases for lambdas? comparable, comparator, runnable, etc
	}

}
