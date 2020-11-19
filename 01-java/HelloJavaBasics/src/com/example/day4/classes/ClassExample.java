package com.example.day4.classes;

public class ClassExample {

	public static void main(String[] args) {
		
		//what is the SIMPLEST way to create an object in java?
		new Animal();
			//HOWEVER, the garbage collector will come scoop this object up and delete it
		
		Animal an; //what THIS is doing is simply creating a reference variable for an
				//Animal object...but it hasn't actually created an object yet
		
		
		
		method1(new Animal()); //reference variables can also be within another
								//  scope (like a method)
		
		Animal an2 = new Animal(); //HERE we are creating an object AND assigning the address to a reference variable
		
		///tangent: what is the difference between initializing and instantiating?
		//		initializing is giving a variable a starting value
		//		instantiating is creating an object in the heap
		int i = 15; //initializing
		new Animal(); //instantiation
		Animal an3= new Animal(15); //BOTH instantiating AND initializing
		
		/////I would like to access my state and behavior....how do I do that?
		//			you would use the "." operator
		//System.out.println(an3.speed);
		//an3.sleep();
			//the "." operator is what triggers the java to go to the heap and find the actual object to gain access to
					//its state and behaviors. The "[ ]" does the same thing for arrays
		//System.out.println(an3); //<--the memory address becase we didn't use the "."
		
		
		//////////WHAT....IN THE BLUE BLAZES....IS A CONSTRUCTOR
		//A constructor is a special type of method that is used to create an object
			///and initialize the object's state?
		
		//Car myCar = new Car();
		Animal an5 = new Animal();
		Animal an6 = new Animal(5);
		
		
		///////////
		Animal chimp = new Animal();
		Animal wolf = new Animal();
		
		//let's look at the speed of these two objects
		System.out.println("chimp: "+chimp.speed);
		System.out.println(" wolf: "+wolf.speed);
		
		chimp.speed= 500;
		
		System.out.println("chimp: "+chimp.speed);
		System.out.println(" wolf: "+wolf.speed);
		chimp.move();
		wolf.move();
		
		//let's look at the bodytemp  of these two objects
		System.out.println("chimp: "+chimp.bodyTemp);
		System.out.println(" wolf: "+wolf.bodyTemp);
		
		chimp.bodyTemp= 101.0;
		
		System.out.println("chimp: "+chimp.bodyTemp);
		System.out.println(" wolf: "+wolf.bodyTemp);
		System.out.println(" the class: "+ Animal.bodyTemp);
		//Animal.
		System.out.println("car's static member, when no car object has been created: "+ Car.myStaticVar);
		System.out.println("num of animals: "+Animal.numOfAnimalsCreated);
		
		
		////THIS  is how you'd access a subclass
		//new Animal.InnerClass();
		
	}
	
	static void method1(Animal myObj) {
		//some logic
		//System.out.println(myObj);
	}

}
