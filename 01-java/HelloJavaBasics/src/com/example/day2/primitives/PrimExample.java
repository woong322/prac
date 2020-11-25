package com.example.day2.primitives;

/*
 * shortcuts:
 * 		intellisense autocomplete:		ctrl + space
 * 		open files:				ctrl + click
 */

/*
 * JAVA NAMING CONVENTIONS:
 * 
 * 	variable-
 * 		camelcase		e.g.	pictureFrame, numOfArrays, dressShirt
 * 
 * 	methods-
 * 		camelcase		e.g. fallDown, flyAway, etc
 * 						verb
 * 	class-
 * 		titlecase		e.g. SilverWare, CollegeStudent, etc
 * 						nouns
 * 	interfaces-
 * 		titlecase		e.g.	Edible, Moveable, etc
 * 						adjectives
 * 	packages-
 * 		lowercase		e.g.	characters, movieclips, etc
 * 
 * 	constants-
 * 		uppercase w/ underscores		e.g. PI, YELLOW_MAX, etc
 */
public class PrimExample {

	public static void main(String[] args) {
		System.out.println("beginning of primitives example");

		/*
		 * What is.....a bit?
		 * 		It is data. It's either a "0" or "1" value. (aka an "on" or "off" value)
		 * 
		 * What is...a nibble?
		 * 	A nibble is 4 bits.
		 * 
		 * What is a.....byte?
		 * 	A byte is 8 bits.
		 * 
		 * 
		 * What are the primitive datatypes in Java?
		 * 	boolean (1bit),  int (4bytes), char (2bytes), float (4bytes),
		 *  double (8bytes), long(8bytes), short ( 2bytes), byte (8bits)
		 * 
		 * What does it mean to be a "primitive datatype"?
		 * 	it's a value, not a reference type. You don't create new instances in the heap of
		 * 	primitives, primitives are stored on the stack.
		 */
		
		//how do we declare a varible in java?
		//like this -->>   "datatype" "variable-name"
		int daName;
		
		//how do we give a variable a value in java?
		//like this -->>   "variable-name" = value;
		//the "=" is the assignment operator
		daName = 15;
		daName = 20;
		
		int x= 16; //we are declaring AND initializing the variable
		
		//back to the primitive datatyptes
		boolean bool = true;	//a true or false value;
		boolean bool2 = false;
			//there are NO falsey or truthy values beyond these two, in java
		byte by = 7; //a smaller more space efficient integer value
		char c = 'T'; //a single character value. Note: we use single quotes around a char value
		int i = 235443657; //an integer numeric value
		double d = 124.12421D; //a decimal numeric value
		float f = 23.2323F; //a decimal numeric value
			//smaller than a double (less accurate)
		short s = 15;	//2 bytes, space efficient integer
		long l = 77L; //8 bytes, larger integer
		
//		System.out.println(f);
//		System.out.println(s);
//		System.out.println(bool);
//		System.out.println(c);
		
		///OTHER PRIMITIVE INFO
		
		//what is a "literal value" in programming?
		//	it is a "hardcoded" value. Literally written into the source code.
		int iTwo = 1323;	//this is a literal whole number value
				//a literal whole number is an int
		double dTwo = 23.23423;	//a literal decimal value will be considered a double
		
		////////////will these lead to a syntax error?
		//float fTwo = 232.23423; //this will lead to a syntax error, a double is larger than an int...so data would be lost
		double dThree = 23242.23432F;	//this is fine because a float is smaller than double, no data is lost
		
		double dFour = 557; //turns this into 557.0  THIS IS IMPLICIT CASTING
		//int iThree = 689.77; //we'd lose data, so java doesn't like this
		
		int iThree = (int)689.77;	//using the   ("datatype")"value"   is the casting syntax
						//THIS IS EXPLICIT CASTING
		//System.out.println(iThree);
		
		
		int iFour = 232_423_246;
		System.out.println(iFour);
		
		
		
		////BONUS topic:
		
		//what is wrong with this?
		//5;
		System.out.println( 5);
		int myTempVar = 5;
	}
	
	
}
