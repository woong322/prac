package com.example.day5.accessmodifiers;

/*
 * What is an access level?
 * -levels of control that determine who/what has access to a specific 
 * 		object/class/method/variable
 * 
 * Access Modifiers and Scopes are NOT the same things.
 * -Scopes define where a member exists (Lifespan)
 * -Access Levels define who has access to a member when is already happens
 * 		to exist (permission)
 * 
 * Access Levels in Java:
 * -public		The class, the package, the children/sub classes, and anyone else
 * -protected	The class, the package, the children/sub classes
 * -(default)		The class, The package
 * -private		The class
 * 
 * the Access Modifiers are "public", "protected", and "private". Default is actually NOT
 * 	an access modifier....if you DON'T give the entity an access modifier then it will default to "default" access level
 */
public class AccessExample {

	public static void main(String[] args) {
		//SIMULATING A CLASS FROM THE SAME PACKAGE
		
		Clothing clothing = new Clothing();
		
		System.out.println(clothing.type);
		System.out.println(clothing.material);
		System.out.println(clothing.color);
		//System.out.println(clothing.cost); //cannot see a private member from a different class even in the same package

	}

}
