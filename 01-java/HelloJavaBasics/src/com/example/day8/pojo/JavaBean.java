package com.example.day8.pojo;

import java.io.Serializable;

/*
 * What is a POJO?
 * 
 * POJO = Plain Old Java Object
 * 
 * A POJO is not chicken
 * 
 * Every object in Java is POJO.
 * 
 * While every object is a pojo, not all pojos are java beans.
 * 
 * What is a Java Bean?
 * A Java Bean is not a coffee bean.
 * 
 * A Java Bean is a POJO that has specific characteristics.
 * -private fields & public getters/setters
 * -a no arg constructor
 * -implements Serializable
 */
public class JavaBean implements Serializable {

	private int i;
	private String j;
	
	public JavaBean() {
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}
}
