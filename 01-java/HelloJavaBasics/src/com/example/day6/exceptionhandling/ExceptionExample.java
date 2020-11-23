package com.example.day6.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) throws IOException {
		Object obj = new Object();
		//throw obj;	//cannot throw any old object
		
		RuntimeException runEx = new RuntimeException();
		//throw runEx; //we CAN throw throwable objects

		//runtimeMethod1(); //let's take a look at the stack trace
		
		
		
		////////////////////////////////////////
		try {
			//you normally "try" code that is risky and could possibly throw something
			Exception ex = new Exception();
			boolean bool = true;
			
			if(bool)
				throw ex;
			else
				throw new FileNotFoundException();
		}catch(FileNotFoundException e) {
			//System.out.println("in FNF catch block");
			/*
			 * the ORDER of the catch blocks matter, don't have a more broad catch block higher
			 * up in the order. Because you'll create an "unreachable code" scenario
			 * (so children classes are higher in order than their parents)
			 */
		}catch(Exception e) {
			//the catch block is a type of flow control, it's essentially branching logic
			//a catch block will only trigger on its appropriate type of exception
			//System.out.println("in catch block");
			//e.printStackTrace();
		}
		
		//////////////////////CAN I CATCH A RUNTIME EXCEPTION?//////////////
		try {
			throw new RuntimeException();
		}catch(RuntimeException bedazzle) {
			//System.out.println("in the runtime exception catch block. So I CAN catch a runtime exception?");
		}
		
		
		///small tangent
		int[] arry1 = {1, 7,88};
		try {
			int myIndex = 70;
			//if(myIndex<arry1.length && myIndex>=0) //the programming an guard against this by being careful
			//System.out.println(arry1[myIndex]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("one: would this not get annoying?");
		}

		try {
			Object myObj = new Object();
			myObj = null;
			//if(myObj != null) //the programming an guard against this by being careful
				myObj.equals(myObj);
		}catch(NullPointerException e) {
			//System.out.println("two: would this not get annoying?");
			//e.printStackTrace();
		}
		
		////////////////CAN I THROW AN ERROR?////////CAN I CATCH AN ERROR?//////
		
		Error myError = new Error();
		try {
			throw myError;
		}catch(Error e) {
			//write code here to download more ram and......okay, nvm, you can't recover from an error
			System.out.println("I caught an error!!!");
		}
		
		//////////////CAN I THROW A THROWABLE?///////CAN I CATCH A THROWABLE?//////
		Throwable toss = new Throwable();
		try {
			throw toss;
		} catch (Throwable e) {
			System.out.println("i caught a throwable");
		}
		
		////////////////////////THROWS demo
		checkedMethod1();
		//yes you CAN put a throws declaration on the main method BUT if the JVM
		//  ever sees your exceptions then it'll shut down the program instantly
		
		System.out.println("done");
	}
	
	////CHECKED METHODS
	static void checkedMethod1() throws IOException {
		checkedMethod2();
	}
	
	static void checkedMethod2()  throws IOException  {
							//this is called "ducking"
		///throw new IOException();
		FinallyExample.helperMethod();
	}
	
	////RUNTIME METHODS
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
