package com.example.day4.classes;

public /* static */ class Animal {

	//INNER CLASS aka NESTED CLASS
	public static class InnerClass{
		/*
		 * yes, you CAN have a static class, but only if it is an "inner class" aka "nested class"
		 */
	}
	
	
	
	////////////////STATE
	static int numOfAnimalsCreated = 0;
	String color = "blue";
	int weight = 100;
	static double bodyTemp = 97.9;
	int speed=60;
	
	///////////////BEHAVIOR
	void sleep() {
		System.out.println("nap time");
		move();
	}
	
	void eat() {
		weight+=10;
	}
	
	void move() {
		weight-=5;
		System.out.println("this object's current speed: "+speed);
	}
	
	static void myStaticMethod() {
		new InnerClass();
		numOfAnimalsCreated--;
		
	}
	
	
	////CONSTRUCTORS
	//a method that has the same name as the class name.
	//a constructor is a special method that is called during the instantiation of an object
	// its job is to set up the initial state of an object AND perform any actions that must be taken when this
		//object is created.
	
//	Animal(){
//		/*
//		 * THIS is what the default constructor looks like
//		 * 
//		 * BY DEFAULT, if you do not create a constructor, Java will GIVE you a constructor.
//		 * We refer to this constructor as the "default constructor".
//		 * 
//		 * BY CHANCE, the "default constructor" HAPPENS TO BE A "no arg constructor". But that doesn't mean
//		 *   that all no arg constructors are default constructors.
//		 */
//	}
	
	//constructors can NOT be static
	/* static */ Animal(){
		//this is called a "no arg constructor"
		//System.out.println("inside Animal's constructor");
		//numOfAnimalsCreated++;
		
	}
	
	Animal(int i){
		//there isn't necessarily a special term for constructors that happen to have arguments,
		// though I'll sometimes refer to them as "arg constructors"
		//System.out.println("in Animal's SECOND constructor");
		
		//numOfAnimalsCreated++;
	}
	
	////////////INITIALIZER BLOCKS
	{
		//THIS will be called every time this class' constructor is called
		// An initializer block is basically a method without a name, so when java sees the block it will call
		// the block IMMEDIATELY because it knows that you wont' ever be able to refer to the block again.
			//System.out.println("in the initializer block");
			numOfAnimalsCreated++;
	}
	
	static{
		System.out.println("can I have a static initializer block?");
	}
	
	
	///////SCOPE
	/*
	 * What is scope?
	 * 	The area where a variable exists. Outside of this area, the varis=able does not exist AT ALL.
	 * 
	 * This is NOT to be confused with access levels......that happen to determine who has access to a
	 * 	a variable when it DOES exist. It deals with permissions, not existence.
	 * 
	 * What are the scopes in Java?
	 * -static scope aka class scope
	 * -instance scope aka object scope
	 * -method scope
	 * -block scope
	 */
	
	static int myStaticScopeVar;
	int myInstanceScopeVar;
	
	void myInstanceScopeMethodOne() {
		int myMethodScopeVar=0;
		
		//note: if I DON'T initialize this method scoped variable, then when I attempt to use it
		//		I will get a syntax error. So method scoped variables do NOT take their default values.
		//So, to continue, we ARE able to use method scoped variables in the method scope.
		System.out.println(myMethodScopeVar);
		
		System.out.println(myInstanceScopeVar); //you CAN access instance scope from method scope
		System.out.println(myStaticScopeVar); //you CAN access static scope from method scope
		
		while(myMethodScopeVar==1) {
			int myBlockScopeVar=0;
			
			//note: if I DON'T initialize this block scoped variable, then when I attempt to use it
			//		I will get a syntax error. So block scoped variables do NOT take their default values.
			//		(long story short, variables take their default values in 3 places: 
			//															static scope, instance scope, and arrays)
			//So, to continue, we ARE able to use block scoped variables in the block scope.
			System.out.println(myBlockScopeVar);
			
			System.out.println(myMethodScopeVar); //you CAN access method scope from block scope
			System.out.println(myInstanceScopeVar); //you CAN access instance scope from block scope
			System.out.println(myStaticScopeVar); //you CAN access static scope from block scope
		}
		
		//System.out.println(myBlockScopeVar); //you may NOT access block scoped variables from method scope
		
	}
	
	{
		//a initializer block to test the instance scope
		
		//System.out.println(myBlockScopeVar); //you may NOT access block scoped variables from instance scope
		//System.out.println(myMethodScopeVar); //you may NOT access method scoped variables from instance scope
		System.out.println(myInstanceScopeVar); //you CAN access instance scope from instance scope
		System.out.println(myStaticScopeVar); //you CAN access static scope from instance scope
	}
	
	void myInstanceScopeMethodTwo() {
		//System.out.println(myMethodScopeVar);
			//No, you can NOT access another method scope's variables from your method scope.
			// each "scope" is sorta personalized.
			//you can use similar logic for two separate static scopes, two separate object scopes, and
			//		two separate block scopes.
	}
	
	static {
		//a static block to test the static scope
		
		//System.out.println(myBlockScopeVar); //you may NOT access block scoped variables from static scope
		//System.out.println(myMethodScopeVar); //you may NOT access method scoped variables from static scope
		//System.out.println(myInstanceScopeVar); //you CAN access instance scope from static scope
		System.out.println(myStaticScopeVar); //you CAN access static scope from static scope
	}
	
	
//	@Override
//	public String toString() {
//		String s = "awoifhawofhoiafhoi";
//		return "looks like this, but we're not going to talk about that right now" +s+" speed: "+speed+" color: "+color;
//	}
	
}
