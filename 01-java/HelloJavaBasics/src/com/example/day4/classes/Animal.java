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
	
	
	
	
	
	
//	@Override
//	public String toString() {
//		String s = "awoifhawofhoiafhoi";
//		return "looks like this, but we're not going to talk about that right now" +s+" speed: "+speed+" color: "+color;
//	}
	
}
