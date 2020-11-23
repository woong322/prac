package com.example.day6.abstraction;

/*
 * What IS an interface?
 * 	An interface is a CONTRACT between the interface itself and an implementing class
 * 
 * Just like a real world contract, the implementing class needs to fulfill constract's criteria.
 * 
 * We use the "implements" keyword to add an interface to a class
 * 
 * We can NOT extends a class from an interface
 * Interface EXTENDS other interfaces
 */
public interface Edible {
	
	//Can an interface have variables?
	/*
	 * There are implicit modifiers on variables inside of an interface:
	 * 		public & static & final
	 */
	int myVariable= 0;

	/*
	 * There are implicit modifiers on methods inside of an interface:
	 * 		abstract & public
	 */
	/* public abstract */ void breakDownIntoNutrients();
	//void breakDownIntoNutrients(int i);
	
	default void ourDefaultMethod() {
		//In Java 8 you CAN have concrete implemention in a method.....IF you use the "default" keyword
		System.out.println("from the FIRST interface's default logic");
	}
	
	static void ourStaticMethod() {
		//Interface CAN have concrete implementation...in the form of Static Methods
	}
	
//	Edible(){
//		//interfaces may NOT have constructors
//	}
	
//	{
//		//interfaces may NOT have an initializer block	
//	}
	
//	static {
//		//interfaces can't have a static nitializer block
//	}
}
