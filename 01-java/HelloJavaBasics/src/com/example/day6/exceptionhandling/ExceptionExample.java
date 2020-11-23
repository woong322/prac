package com.example.day6.exceptionhandling;

import java.io.FileNotFoundException;

public class ExceptionExample {

	public static void main(String[] args) {
		Object obj = new Object();
		//throw obj;	//cannot throw any old object
		
		RuntimeException runEx = new RuntimeException();
		//throw runEx; //we CAN throw throwable objects

		//runtimeMethod1(); //let's take a look at the stack trace
		
		
		try {
			//you normally "try" code that is risky and could possibly throw something
			Exception ex = new Exception();
			boolean bool = true;
			
			if(bool)
				throw ex;
			else
				throw new FileNotFoundException();
		}catch(FileNotFoundException e) {
			System.out.println("in FNF catch block");
			/*
			 * the ORDER of the catch blocks matter, don't have a more broad catch block higher
			 * up in the order. Because you'll create an "unreachable code" scenario
			 */
		}catch(Exception e) {
			//the catch block is a type of flow control, it's essentially branching logic
			//a catch block will only trigger on its appropriate type of exception
			System.out.println("in catch block");
			//e.printStackTrace();
		}
		
		System.out.println("done");
	}
	
	
	
	static void runtimeMethod1() {
		runtimeMethod2();
	}
	
	static void runtimeMethod2() {
		//RuntimeException runEx = new RuntimeException();
		//throw runEx; //we CAN throw throwable objects
		Object obj = null;
		obj.toString();
	}

}
