package com.example.day6.ioserialization;

import java.io.Serializable;

/*
 * A marker interface is an interface that has NO abstract methods that you need to implement
 * 	(marker interfaces allow you to implement black/white list scenarios in OOP)
 * 
 * A functional interface is an interface that has EXACTLY ONE method for you to implement
 * 
 * If an interface has two or more methods for you to implement then it doesn't have a
 * 		special name, it's just an interface
 * 
 * Serializable happens to be a marker interface
 * 
 * What is the difference between a white list and a black list?
 * -in a blacklist by default EVERYONE is allowed access, those on the blacklist have had their access revoked
 * -in a whitelist by default NO ONE is allowed access, those on the whitelist have been granted access
 * 
 * Serializable happens to be a whitelist scenario
 */
public class Person implements Serializable{

	/**
	 * This is essentially a ID number for your class
	 * BECAUSE if you read in a class called "Person" from a file...that does NOT mean that
	 * it is YOUR class file that was written to the file. In other words, what is 24 people in your dev
	 * team each made a "Person" class.....if you read in one of theirs then the ObjectInputStream will
	 * check the ID number of your class and make sure it's the same as the class written in the file
	 */
	private static final long serialVersionUID = 234928872L;
	
	private String name;
	private int age;
	private transient String ssn; //the "transient" modifier stops a field from being written to a file
	
	/*
	 * no arg constructor
	 * all constructor
	 * getters/setters
	 * toString
	 */
	
	public Person() {
	}

	public Person(String name, int age, String ssn) {
		super();
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", ssn=" + ssn + "]";
	}
}
