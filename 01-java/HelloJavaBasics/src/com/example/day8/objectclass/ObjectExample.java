package com.example.day8.objectclass;

public class ObjectExample {

	public static void main(String[] args) {
		// This is the Object class. All classes are descendants of the Object class
		Object obj = new Object();
		
		obj.toString(); //System.out.print secretely and automatically
			//calls this method to determine what prints to the console.
		
		//obj.equals(anotherObject); //compares memory address of two objects to each other
			//UNLESS it is overridden
			//you'll OFTEN want to override the equal() method so that it compares the CONTENTS of the
			//	objects instead of the memory addresses. If you want to compare memory addressess you can just
			//	use "=="
		
			//sidenote: "==" compares the memory address of two objects, or values of two primitives
		
		obj.hashCode(); //creates a psuedo unique value, determined by the object itself
			//this values is used inside of HashMaps (under the hood)
		
		System.out.println(obj.hashCode());

	}

}
