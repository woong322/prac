package com.example.model;

public class SessionUser {

	private String myUsername;
	private String myPassword;
	
	public SessionUser() {
	}

	public SessionUser(String myUsername, String myPassword) {
		super();
		this.myUsername = myUsername;
		this.myPassword = myPassword;
	}

	public String getMyUsername() {
		return myUsername;
	}

	public void setMyUsername(String myUsername) {
		this.myUsername = myUsername;
	}

	public String getMyPassword() {
		return myPassword;
	}

	public void setMyPassword(String myPassword) {
		this.myPassword = myPassword;
	}

	@Override
	public String toString() {
		return "SessionUser [myUsername=" + myUsername + ", myPassword=" + myPassword + "]";
	}
}
