package com.example.day6.abstraction;

/*
 * Abstraction- revealing WHAT somethign does, not HOW it does that something
 * 
 * In the case of abstract methods (or classes) we know conceptually what the method needs to do
 * 	and the parameters it's allowed ot use BUT the implmeentation is hidden from us.
 * 
 * 
 * Abstract classes and Concrete classes have more similiarities than they have
 * 	differences
 * 
 * Some of the differences include:
 * 	-Abstract Classes cannot be instantiated
 * 	-Abstract Classes can have abstract methods
 * 		-an abstract method MUST be overridden
 * 
 * 
 * Beyond these differences, the inherritance works exactly the same as a concrete class
 * 
 * -----------------
 * Differences between Abstract Classes (AC) and Interfaces:
 * 
 * 		interface										AC
 * ---------------------					------------------------------------
 * abstract method (until default)				concrete & abstract methods
 * implements keyword							extends keyword
 * (interfaces extends other interfaces)
 * methods implicitly:							no implicit modifiers
 * 		abstract & public
 * variables impliticly:
 * 		public static final
 * NO constructor								YES constructor
 * 					BOTH OF THEM HAVE STATIC METHODS
 * -----------------
 * 
 * why would we use one over the other?
 * PRO ac:	can provide concrete implmentations (including methods and instance variables)
 * 		(java 8 added default....so the interface can now have concrete methods)
 * PRO ac:	constructor
 * PRO i:	can implements multiple interfaces wtihout taking up the ONE spot you ahve to exetnd a class
 * ---------------
 * 
 *  If the parent (or binding contract) defines what the child's "destiny" or "purpose" is...
 *  	then the parent should be an AC
 *  
 *  If the parent (or binding contract) simply adds a couple additional functionalities to the "child"
 *  	then the "parent" should be an interface
 */
public class AbstractionExample {

	public static void main(String[] args) {
		//Food food = new Food();	//Abstract Classes cannot be instantiated

		///////////////ABSTRACT CLASSES
		BuffaloChicken buffChick = new BuffaloChicken();
		Food foodOne = new BuffaloChicken(); //upcasting is possible
		buffChick.ourDefaultMethod();
		((Freezable)buffChick).ourDefaultMethod();
		
		//Pizza pizza = new Pizza(); //this is an abstract class that extends an Abstract class
		///Food foodTwo = new Pizza();	//Pizza cannot be instantiated
		
		Pizza pizza = new PepperoniPizza();
		Food foodTwo = new PepperoniPizza();
		
		///////////////INTERFACES
		//Edible edible = new Edible(); //Interfaces cannot be instantiated
		Edible ed2 = new BuffaloChicken();
		Edible.ourStaticMethod();
	}

}
