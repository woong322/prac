package com.example.day6.ioserialization;

public class Person {

	private String name;
	private int age;
	private String ssn;
	
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
