package com.example.day6.exceptionhandling;

public class CustomExceptionDriver {

	public static void main(String[] args) throws MyCustomException {
		MyCustomException myE = new MyCustomException();
		//throw myE; //we DEFINITELY made an exception
		
		MyCustomRuntimeException myRunE = new MyCustomRuntimeException();
		//throw myRunE; //we DEFINITELY made a runtime exception

		
		//DEMO OF THE CONSTRUCTORS
		MyCustomException myE2 = new MyCustomException("Space Monkey");
		MyCustomRuntimeException myRunE2 = new MyCustomRuntimeException("Muffin Button", myE2);
		MyCustomRuntimeException myRunE3 = new MyCustomRuntimeException("BuffaloChicken", myRunE2);
		
		throw myRunE3;
	}

}
