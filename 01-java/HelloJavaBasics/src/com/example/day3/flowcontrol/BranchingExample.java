package com.example.day3.flowcontrol;

public class BranchingExample {

	public static void main(String[] args) {
		/*
		 * 	if( [condition] ) {
		 * 		//logic to execute assuming the condition is true
		 * }else{
		 * 		//logic to execute assuming the condition is false
		 * 		//you don't HAVE to have a else block, btw.
		 * }
		 * 
		 * the [condition] always boils down to a true or false value
		 * 
		 * conditional operators: &&, ||, !, >, <, <=, >=, !=, ==
		 */
		boolean bool = true;
		
		if(bool) {
			//System.out.println("in if block");
		}else {
			// System.out.println("in else block");
		}
		
		//////////////
		int tempNum= 90;
		
		if(tempNum==90) {
//			System.out.println("in first");
//			System.out.println("in other first");
//			tempNum=40;
//			System.out.println("again in first");
		} else if (tempNum == 40 /* && method()==5 */){
//			System.out.println("in second");
		} else if (tempNum == 38 /* && method2()==method3() */){
//			System.out.println("in third");
		}else {
//			System.out.println("in else");
		}
		
		////////////////////////////
		/*
		 * flow control withotu curly braces
		 */
//		boolean boolTwo = true;
//		
//		if(boolTwo==false) 
//			System.out.println("first");
//			System.out.println("second");
		
			
			
		////////////////TERNARY OPERATOR    "?" //////////////////
		int x=5;
		
		int y = (x>=300) ? 50 : 100;
		//System.out.println(y);
			
		//don't ALWAYS try to use ternary statements...they can get messy
		y= (x>=300) ? ((600==x)? 8: 9) : (method() *10) * ((100>x)? method() * 2 :5);
			
		
		
		///////////////SWITCH CASE ///////////////////////
		int num = 400;
		
		switch(num) {
		default:
			//System.out.println("if all else fails");
			break;
		case 1:
				//System.out.println("first");
		case 2:
			//no logic here....AND no break;
		case 3:
		case 4:
				//System.out.println("second");
				break;
		case 40:
				//System.out.println("third");
		case 55:
				//System.out.println("fourth");
		}
		
		
		///////////
		/*
		 * there are RULES for what datatypes can be used with switch cases
		 * 
		 * acceptable datatypes:
		 * 		int, short, byte, char, (all of their respective wrapper classes),
		 * 		enum, String
		 * 
		 * wrapper classes:
		 * 	Integer, Character, Short, Byte, Double, Long, Boolean, Float
		 */
		short example = 77;
		
		switch(example) {
		case 77:
			System.out.println("worked!");
		}
		
		
		///////////NESTING FLOW CONTROL
		//yes, you can nest your flow control statments (branching, looping,etc)
		boolean myBool = true;
		
		if(myBool) {
			if(myBool) {
				
			}else {
				
			}
		}else {
			
		}
		
		
		
		System.out.println("done");
		
	}
	
	static int method() {
		return 5;
	}
}
