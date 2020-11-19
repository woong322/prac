package com.example.day4.inheritance;

/*
 * Our hierarchy:
 * 
 * 				Object
 * 				   |
 * 				Animal
 * 			  /		    \
 * 		Monkey			Turtle
 * 		  |
 * 		Chimp
 * 
 * 
 * so we've effectively created a "parent/child" relationship aka a "is a" relationship.
 * 
 * What is "is a" vs "has a"?
 *  
 *  "is a" means you ARE a type of object; it's like living a double life, where you have two identities.
 *  
 *  "has a" means youre CONTAIN a type of object; it's like you owning a car...you are NOT a car, you just own one
 */
public class InheritExample {

	public static void main(String[] args) {
		//Animal an = new Animal();
		//an.
		
		//Monkey mon = new Monkey();
		//mon.
		
		Chimp chi = new Chimp();
		//chi.
		
		//Turtle turt = new Turtle();
		//turt.
		
		
		
		
		
		
		/*
		 * Can we use polymorphism? YES WE CAN!!!
		 * 
		 * types of polymorphism: overloading, upcasting, overriding, downcasting
		 * 
		 * overloading is compile time polymorphism
		 * overriding is runtime time polymorphism
		 * upcasting is runtime time polymorphism
		 * downcasting is runtime time polymorphism
		 */
		//Animal myAnimal = new Turtle();	//upcasting
		//myAnimal.	//you will NOT see the Turtle object's members anymore
		
		//Turtle myTurtle = (Turtle)myAnimal; //downcasting
		//myTurtle.
		
//		Animal myAnimal2 = new Animal();
//		Turtle myturtle2 = (Turtle)myAnimal2; //downcasting, BUT this will lead to a "ClassCastException"
		
		
		
		
		/*
		 * What is overriding?
		 *   A child class creating a method with the SAME NAME (and parameter list) as a method
		 *   in the parent class; this results in the behavior/functionality being altered
		 */
//		chi.makeNoise(); //prints from animal
//		turt.makeNoise(); //prints from turtle
//		((Animal)turt).makeNoise(); //prints from turtle still....because the old functionality is literally GONE
		
		
		/*Can we override a variable in java? NO....we can only shadow a variable
		 * What is shadowing? 
		 * 
		 * shadowing essentially means, that a variable is more difficult to access, BUT IT STILL DOES EXIST
		 * 
		 */
//		System.out.println(chi.height); //prints from animal
//		System.out.println(turt.height); // prints from turtle
//		System.out.println(((Animal)turt).height); //prints from animal
		
		
		//can we override a static method?
	}
	
	
	
	
	
	
	
	
	
	
	/*
	 * quick high level description of decoupling/spaghetti code
	 * 
	 * 
	 * What is spaghetti code? (aka tightly coupled code)
	 *      when small changes in your source create unnecessary changes that ripple through your ENTIRE program.
	 *      it cause a lot of restructing to be done in your code base. Your code is tangled up like spaghetti
	 * 
	 * class Animal {}
	 * 
	 * class Chimp{ //each animal will be focused on overriding as opposed to creating new functionality}
	 * class Hawk{}
	 * class Wolf{}
	 * class Turtle{}
	 *     then I have 46 more of these
	 * 
	 *     ONE ZOO FOR CHIMPS
	 * class ZooContainerClass{
	 * 		Chimp c;
	 * 
	 * 		ZooContainerClass(Chimp incomingChimp){
	 * 			c = incomingChimp
	 * 		}
	 * 
	 * 		method1(){
	 * 			//operates on the chimp object
	 * 		}
	 * 
	 * 		method2(){
	 * 			//operates on the chimp object
	 * 		}
	 * }
	 *      ONE ZOO FOR WOLVES
	 * class ZooContainerClass{
	 * 		Wolf w;
	 * 
	 * 		ZooContainerClass(Wolf incomingWolf){
	 * 			w = incomingWolf
	 * 		}
	 * 
	 * 		method1(){
	 * 			//operates on the wolf object
	 * 		}
	 * 
	 * 		method2(){
	 * 			//operates on the wolf object
	 * 		}
	 * }
	 * 
	 * 
	 * HOW WE DECOUPLE AKA DESPAGHETTIFY OUR CODE IS USING UPCASTING (one of the ways, anyway)
	 *      ONE ZOO FOR ALL ANIMALS
	 * class ZooContainerClass{
	 * 		Animal a;
	 * 
	 * 		ZooContainerClass(Animal incomingAnimal){
	 * 			a = incomingAnimal
	 * 		}
	 * 
	 * 		method1(){
	 * 			//operates on the animal object
	 * 		}
	 * 
	 * 		method2(){
	 * 			//operates on the animal object
	 * 		}
	 * }
	 */

}
