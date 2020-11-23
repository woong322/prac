package com.example.day6.exceptionhandling;

public class MyCustomRuntimeException extends RuntimeException {

	public MyCustomRuntimeException() {
		super();
	}
	
	public MyCustomRuntimeException(String message) {
		super(message);
	}
	
	public MyCustomRuntimeException(String message, Throwable clause) {
		super(message, clause);
	}
}
