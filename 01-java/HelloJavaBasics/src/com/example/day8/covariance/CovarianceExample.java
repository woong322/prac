package com.example.day8.covariance;
/*
 * Covariant return types allow an overridden method to alter the method's
 * return type.
 * The new return type must be a SUBSET of the original return type.
 * 
 * Animal a = new Monkey();						animal's method 1 returns object, monkey's returns string
 *  Object obj =a.method1();  //this line is prepared for what?
 *  								//what is the reverse was true?
 *  							String str =a.method1();   animal returns string, monkey returns object
 *  --------------------------------------------
 *  Covariant access modifiers allow an overridden method to alter the method's access
 *  modifiers.
 *  The new access modifier must be MORE inclusive rather than less inclusive.
 *  
 *  Animal a = new Monkey();					animal's method1 is protected, monkey's is public
 *  a.method1();	//this is from main method, what is java prepared for?
 *  						///what if the reverse was true?
 *  					a.method1();    animal is protected, monkey is private
 *  
 *  ------------------------------------------------
 *  Covariance in the throws declaration is possible as well. You may throw LESS exceptions, but
 *  not add NEW exceptions that the parent was not prepared for.
 *  
 *  Animal a = new Monkey();					animal's method1 throws A, B,  monkey's throws B
 *  a.method1();  //what is the main method prepared for right now?
 *  						///what if the reverse was true?
 *  					a.method1();		animal throws A,B,    monkeys throws  B, C
 *  
 *  BONUS NOTE: you may add the "final", "synchronized", etc keywords to overridden signatures
 */
public class CovarianceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
