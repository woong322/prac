package com.example.day5.strings;

/*
 * What is a String?
 * 	-An object that contains an array of characters; and adds functionality to the array.
 * 	-A String is immutable
 * 
 * What does "immutable" means?
 * 	can't be changed
 * 
 * A String is sometimes considered a "psuedo primitive"
 */
public class StringExample {

	public static void main(String[] args) {
		//ways of creating a String in Java
		String s1 = "Sup World";
		String s2 = new String("Hello World");

//		System.out.println(s1.length());
		
		String s = "Donuts";
		s=s.concat(" from Krispy Kreme");
		
//		System.out.println(s);
		
//		System.out.println(s.equals("Donuts from Krispy Kreme")); //ture
//		System.out.println(s.length()); //24
//		System.out.println(s.charAt(4)); //t
//		System.out.println(s.substring(8)); //rom Krispy Kreme
//		System.out.println(s.substring(8, 10)); //[inclusive, exclusive)	"ro"
//		System.out.println(s.indexOf("ris"));  //13
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.isEmpty()); //returns a boolean representing whether the string is empty or not
//		System.out.println(s.split(" "));
		
//		for(String temp: s.split(" ")) {
//			System.out.println(temp);
//		}
		
//		for(String temp: s.split("")) {
//			System.out.println(temp);
//		}
		
		
		
		///////////StringBuilder  is mutable
		//StringBuilder is NOT threadsafe
		StringBuilder sb = new StringBuilder("Hello from");
		sb.append(" the other siiiiiiiiide~!");
		//System.out.println(sb);
		
		
		////////////StringBuffer is mutable
		//StringBuffer is threadsafe
		StringBuffer sbuff = new StringBuffer("ballroom");
		sbuff.append(" blitz");
		//System.out.println(sbuff);
	
	
	
		////NOW........that we understand Strings a bit...I have a question.....
		//HOW....is it possible that a String is immutable?
		/*
	 	* A String is immutable because of a combination of THREE facts:
	 	* -All String modifying methods intentionally NEVER alter the existing String, they always create a new
	 	* 			String and return it
	 	* -The class is final, so that no one can ever create a child class and override the String's intended functionality
	 	* -The char[] inside String is final so you can NEVER point to a different array, to get around the immutability
	 	*/
	
	
		/////I have another question.....WHY is a String immutable? Why put in this much effort? What's the payoff?
	
	
		//let's get away from that question for a bit, and go over some basics
		Object obj1 = new Object();
		Object obj2 = new Object();
	
		//with objects
		if(obj1==obj2) { // the "==" comparison operator compares the memory addresses
		System.out.println("1. the objects have equal addresses");
		}else {
		System.out.println("1. the objects do NOT have equal addresses");
		}
		
		//with string literals
		String str1 = "SpaceMonkey";
		String str2 = "SpaceMonkey";
		String str5 = "MountainGoat";
		
		if(str1==str2) {
			System.out.println("2. the strings have equal addresses");
		}else {
			System.out.println("2. the strings do NOT have equal addresses");
		}
		
		//with strings using the new keyword
		String str3 = new String("SpaceMonkey");
		String str4 = new String("SpaceMonkey");
		
		if(str3==str4) {
			System.out.println("3. the strings have equal addresses");
		}else {
			System.out.println("3. the strings do NOT have equal addresses");
		}
		
		if(str3.equals(str4)) { //the purpose of the "equals" method is to compare the contents
			System.out.println("4. the strings have equal addresses");
		}else {
			System.out.println("4. the strings do NOT have equal addresses");
		}
	}
}












