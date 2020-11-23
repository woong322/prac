package com.example.day6.abstraction;
/*
 * java does NOT support multiple inheritance
 * 
 * BUT...you can implements multiple interfaces...an interface is a CONTRACT...NOT
 * 		a parent.
 */
public class BuffaloChicken extends Food implements Edible, Freezable{

	
	public BuffaloChicken() {
		super();
	}
	
	////////////ABSTRACT CLASS METHODS
	@Override
	public void goBad() {
		
	}

	///////INTERFACE METHODS
	
	@Override
	public void breakDownIntoNutrients() {
		System.out.println(this.myVariable);
	}
	
	@Override
	public void ourDefaultMethod() {
		//if TWO separate interfaces provide you with default methods, then you MUST override
		// that method to erase any ambiguity
		System.out.println("overriden default method");
	}

}
