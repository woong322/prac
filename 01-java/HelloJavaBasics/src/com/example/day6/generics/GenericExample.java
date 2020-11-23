package com.example.day6.generics;

import java.io.Serializable;
/*
 * Generics use angle brackets to create a "placeholder" for a future datatype.
 * 
 * When instantiating a generic object you must provide the datatype, from that point
 * that SPECIFIC generic object will always use that provided datatype.
 * but other instance from that generic class can be given other datatypes.
 * (each individual instance can NOT change its datatype)
 * 
 * NOTE: GENERICS DO NOT WORK WITH PRIMITIVES, ONLY OBJECTS
 * 
 * generics are a form of polymorphism
 */


class GenericClass<BunnyWabbit extends Serializable>{
	private BunnyWabbit value;
	
	public GenericClass(BunnyWabbit value) {
		this.value= value;
	}
	
	public BunnyWabbit getValue() {
		return value;
	}
}

/*
 * OTHER WAYS WE CAN USE GENERICS
 * 
 * YOu're able to use geneerics with methods:
 * 	public static <T> void method1(T myVariable) { T.toString(); }
 * 
 * You're able to use generics like:
 * 	public final <T, J> void method1(T myVar, J myOtherVar) {blahblahblah...}
 * 	public final <first, second> void method1(blahblahblah....
 * 
 * YOu're able to use generics like:
 * 		private static <T extends Serializable> void method2(T myVar) {}
 * 			//aka you can restrict which objects are acceptable based on an implementing interface
 * 
 */

public class GenericExample {
	
	public static <T> T method1(T myVar) {
		return null;
	}

	public static void main(String[] args) {
		//for the generic method
		//you do'nt do THIS
		//method1<Object>(new Object());
		//THIS is how you call a generic method
		method1(new Object());

		
		//////now let's look at generic classes
		GenericClass<Integer> firstExample = new GenericClass<Integer>(5);
		//System.out.println(firstExample.getValue() instanceof Integer);
		
		GenericClass<String> secondExample = new GenericClass<String>("Hello");
		//System.out.println(secondExample.getValue() instanceof String);

		//generics do NOT support primitives
		//GenericClass<int> thirdExample = new GenericClass<int>(5);
		
		//this will no longer work because it is not serializable
		//GenericClass<Object> fourthExample = new GenericClass<Object>("stuff");
		//System.out.println(fourthExample.getValue() instanceof String);
		
		//later version of java don't force you to type the datatype in BOTH sets of angle brackets
		GenericClass<String> fifthExample = new GenericClass<>("Hello");
		
		/*
		 * if you don't use diamond brackets then the generics will default to object datatype
		 * 
		 * This is NOT good practice, the angle brackets offer compile time safety
		 */
		GenericClass sixthExample = new GenericClass<>("Hello");
		System.out.println(sixthExample.getValue() instanceof String);
		
		
		
		
		
		//quick demo of "instanceof"
		//		(object)	instanceof	(Class/Interface)
//		Object obj = new Object();
//		String str = "hello";
//		System.out.println(str instanceof Serializable);

	}

}
