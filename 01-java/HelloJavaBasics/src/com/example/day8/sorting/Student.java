package com.example.day8.sorting;

import java.time.LocalDate;

public class Student implements Comparable<Student>{

	private int studentId;
	private String name;
	private double gpa;
	private LocalDate dob;
	
	/*
	 * no arg constructor
	 * all arg constructor
	 * getters/setters
	 * toString()
	 */
	public Student() {
	}

	public Student(int studentId, String name, double gpa, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.gpa = gpa;
		this.dob = dob;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "\nStudent [studentId=" + studentId + ", name=" + name + ", gpa=" + gpa + ", dob=" + dob + "]";
	}

	@Override
	public int compareTo(Student o) {
		/*
		 * compareTo() will return a negative number, 0, or a positive number.
		 * 
		 * Collections.sort() OR treeMap/Set will use this value to determine the order
		 * of the elements.
		 * 
		 * Negative nubmers mean THIS object is "less" than the other object.
		 * 0 means THIS object is equal to the other object
		 * Positive numbers mean THIS object is "more" than the other object.
		 */
		return this.getStudentId()-o.getStudentId();
	}
}
