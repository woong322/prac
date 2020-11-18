package com.example.day3.flowcontrol;

public class CircuitExample {

	public static void main(String[] args) {
		/*
		 * 	truth tables
		 * 
		 * 		AND
		 * 	T			T		=	T
		 *  T			F		=	F
		 *  F			T		=	F
		 *  F			F		=	F
		 *  
		 * 		OR
		 * 	T			T		=	T
		 *  T			F		=	T
		 *  F			T		=	T
		 *  F			F		=	F
		 *  
		 *  		 EXCLUSIVE OR
		 * 	T			T		=	F
		 *  T			F		=	T
		 *  F			T		=	T
		 *  F			F		=	F
		 * 
		 * 
		 * bitwise quick explanation
		 * 		or
		 * 0 1 0 0	= 4
		 * 0 1 1 1	= 7
		 * --------
		 * 0 1 1 1
		 */
		
		int i=1;
		
		if((i==0) && method1()) {
			System.out.println("in if block");
			
			/*
			 * shortcircuiting operators
			 * 		&&  ,  ||
			 * 
			 * bitwise operators
			 * 		&   ,   |
			 */
		}else {
			System.out.println("in else block");
		}
	}
	
	public static boolean method1() {
		/*
		 * 700 lines of code that took 12 seconds to execute, soo we may want to consider shortcircuiting
		 */
		//OR
		/*
		 * what if this method calls a database that NEEDS to update data EVERY time that if statement is triggered.
		 * so you may want to consider using bitwise operators
		 */
		System.out.println("in the method");
		return true;
	}
}
