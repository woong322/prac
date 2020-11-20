package com.example.day5.encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {

		Food food = new Food();
//		
//		System.out.println(food.name);
//		System.out.println(food.recipe);
//		System.out.println(food.calories);
		//and 37 more usages
		
		///System.out.println(food.getName());
		
		
		
		//SECRETLY the println() and print() methods will call the toString() method of any object you give it
		System.out.println(new GetSetModelDemo());

		
		Object o;
	}

}
