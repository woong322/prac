package com.example.day4.inheritance;
			//does java support multiple inheritance?	NO IT DOES NOT
public class Turtle extends Animal /* , Monkey */ {

//	{
//		//you also just change the parent's variable's value
//		height= 60;
//	}
	
	
	boolean shell = true;
	String color = "green";
	
	int height = 24; //<---this variable is SHADOWED, not overridden
	
	void hideInShell() {
		System.out.println("or just do kungfu and eat pizza");
	}
	
	/*
	 * What is overriding?
	 *   A child class creating a method with the SAME NAME (and parameter list) as a method
	 *   in the parent class; this results in the behavior/functionality being altered
	 */
	@Override	//<----THIS is an annotation
	//@Deprecated
	void makeNoise() {
		//super.makeNoise();
		System.out.println("turtle turt");
	}
	
	/*
	 * The override annotation is for clarity/readability AND it ensures that there IS
	 *  a method in the parent class that you are overriding.
	 *  (it protects you from misspelling the method name)
	 *  
	 *  The deprecated annotation lets the developers know that this functionality will no longer
	 *  	be supported in the future. It STILL DOES FUNCTION, but the developer should move
	 *  	to a newer functionality that replaces the deprecated functionality.
	 */
	
	
	//@Override //no you can't override a  static method
	static void ourStaticMethod() {
		//static methods are SHADOWED, no overridden
		System.out.println("static method from animal class");
	}
}
