package com.example.day6.abstraction;

/*
 * YOu may have concrete methods inside of an abstract class.
 * Any abstract methods MUST exist within an abstract class, they can't exist within a concrete class
 */
public abstract class Food {

	String name;
	private String[] ingredients;
	
	//no you can NOT have an abstract variable
	/* abstract */ int calories;
	
	//CONSTRUCTORS? Can an abstract class have a constructor?
	// ALSO, you may NOT have an abstract constructor
	/* abstract */ Food(){
		//yes, Abstract class can & do have constructors
		//System.out.println("In Abstract Class Food Constructor");
	}
	
	public abstract void goBad();
	
	public void concreteMethod() {
		//we CAN have a concrete method inside of an Abstract Class
		
		//the curly braces of a method represents the "body" of the method aka the method "implementation"
		// EVEN IF the curly braces have nothing inbetween it is an implmentation. ANY EMPTY IMPLEMENTATION, but
		//		an implementation none the less
	}
	
	
	//we may NOT have a static abstract method
	//abstract static void ourStaticMethod();
	
	//you may NOT have an abstract initializer block
	/* abstract */{
		//can we have an abstract initializer block?
	}
}
