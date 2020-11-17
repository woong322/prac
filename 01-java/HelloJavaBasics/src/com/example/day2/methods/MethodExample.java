package com.example.day2.methods;

public class MethodExample {

	/*
	 * the method signature:
	 * 
	 * 		[modifier(s)]	[return type]	[method name]	( [parameter list] )
	 * 		{
	 * 						//the method's logic
	 * 		}
	 * 
	 * 
	 * tanget: let's take a look at precedence order in java
	 * 		-go ahead and google "java precedence order" and click on one of the links to find a table
	 * 			sysout(methodCall(5));
	 * 
	 * a return type is a value that will replace the method's call for use in further computation
	 * 
	 * modifiers can be keywords like: public, protected, private, static, final, default, synchronized, transient,
	 * 	abstract, etc
	 * 
	 * Question....what is a parameter vs an argument?
	 * 		a parameter is apart of the method signature, it is declaring what type of variables will be
	 * 			accepted into a method call
	 * 
	 * 		an argument is the actual value placed into a method call
	 */
	
	
	final static int ourStaticMethod(double num) {	//"double num" is a parameter NOT an argument
		System.out.println("in our static method");
//		/// this is our logic
//		System.out.println("begin cycle");
//		int i = 5;
//		i = i + 5;
//		i = i * 2;
//		System.out.println(i);
//		i = i * 3;
//		System.out.println(i);
//		//////
		return 7;
	}

	public static void main(String[] args) {
		System.out.println("In method example");

		/*
		 * What is a method? a method is a snippet of reusuable functionality.
		 * (essentially a block of code that is reusuable)
		 * 
		 * methods allow us to modularize our logic.
		 * 
		 * what is modularization?
		 * 	the process of creating a module of resuable functionality.
		 * 
		 * why create a module of reusable functionality?
		 * 	>maintability.
		 *  >prevents update anomalies
		 *  		>aka if you accidentally miss one of the updates
		 *  >readability
		 */
		
		// INSTEAD OF COPYING AND PASTING CODE...WHAT IF WE USE A METHOD!?!?!
		ourStaticMethod(5); //THIS is how you "invoke" a method. aka "call" a method
		ourStaticMethod(5);
		ourStaticMethod(5);	//5 is an argument NOT a parameter
		ourStaticMethod(5);
		
		//THIS is not modularized code
//		///// this is our logic
//		System.out.println("begin cycle");
//		int i = 5;
//		i = i + 5;
//		i = i * 2;
//		System.out.println(i);
//		i = i * 3;
//		System.out.println(i);
//		//////
//		///// this is our logic
//		System.out.println("begin cycle");
//		i = 5;
//		i = i + 5;
//		i = i * 2;
//		System.out.println(i);
//		i = i * 3;
//		System.out.println(i);
//		//////
//		/////// then again 38 more times
	}
}
