package com.example.day6.exceptionhandling;

public class MyCustomException extends Exception {

	public MyCustomException() {
		super();
	}
	
	public MyCustomException(String message) {
		super(message);
	}
	
	public MyCustomException(String message, Throwable clause) {
		super(message, clause);
	}
}
