package com.example.model;

public class MyCustomStatusMessage {
	
	private String myMessageOne;
	private String myMessageTwo;

	public MyCustomStatusMessage() {
	}

	public MyCustomStatusMessage(String myMessageOne, String myMessageTwo) {
		super();
		this.myMessageOne = myMessageOne;
		this.myMessageTwo = myMessageTwo;
	}

	public String getMyMessageOne() {
		return myMessageOne;
	}

	public void setMyMessageOne(String myMessageOne) {
		this.myMessageOne = myMessageOne;
	}

	public String getMyMessageTwo() {
		return myMessageTwo;
	}

	public void setMyMessageTwo(String myMessageTwo) {
		this.myMessageTwo = myMessageTwo;
	}

	@Override
	public String toString() {
		return "MyCustomStatusMessage [myMessageOne=" + myMessageOne + ", myMessageTwo=" + myMessageTwo + "]";
	}
}
