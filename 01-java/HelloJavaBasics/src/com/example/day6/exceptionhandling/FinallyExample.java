package com.example.day6.exceptionhandling;

import java.io.IOException;

public class FinallyExample {
	
	public static int whatHappensIfYouReturnInAFinallyBlock() {
		boolean bool = true;
		try {
			if(bool) {
				//throw new IndexOutOfBoundsException();
				return 20;
			}else {
				//System.out.println("everything went smoothly");
				//throw new Error(); //this won't stop the finally block
				System.exit(0); //system.exit WILL stop the finally block
			}
		}catch(Exception e) {
			System.out.println("in the catch block");
			//return 15;
		}finally  {
			/*
			 * A finally block always runs?
			 * 
			 * the objective of the finally block is to run its logic regardless
			 * of whether or not there is an exception thrown. The Finally is often used to
			 * close resources; there are more use cases, but this is a common one.
			 * 
			 * THERE ARE TECHNICALLY CASES WHERE THE FINALLY BLOCK WON'T RUN
			 * -System.exit();
			 * -Fatal Errors
			 * -System/Hardware failure
			 */
			System.out.println("in the finally block");
			//return 50;
		}
		
		return 25;
	}

	public static void main(String[] args) {
		
		System.out.println(whatHappensIfYouReturnInAFinallyBlock());
		
		
		
		//////we CAN have a try-catch block
		//	we CAN have a try-finally block IF there are no exceptions being thrown
		// we CAN have a try-catch-finally block
		try {
			//throw new IOException();
		}finally {
			
		}
		///////we cannot have a try block by itself

	}

	//this is a helper method for the "ExceptionExample" class
	public static void helperMethod() throws IOException{
		throw new IOException();
	}
}
