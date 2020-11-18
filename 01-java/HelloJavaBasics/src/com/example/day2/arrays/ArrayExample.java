package com.example.day2.arrays;

import java.util.ArrayList;

/*
 *  ( )		<-------parenthesis
 *  [ ]		<------ brackets, square brackets
 *  { }		<-----curly braces, curly brackets
 *  < >		<------diamond brackets, angle brackets, hard brackets, arrow brackets, chevrons
 *  
 *  #		<------pound sign, hashtag, octothorpe
 * 
 */
public class ArrayExample {

	public static void main(String[] args) {
		/*
		 * what is an array???
		 * 	It's a series of data entries (of the same datatypes). Sequential in memory.
		 * 
		 * (you can also describe it as a "group" or "matrix")
		 * 
		 * THIS [6,7,8]
		 * NOT ["mikey", 5, false]   ....but this CAN happen in JavaScript
		 * 
		 * Object[ animal object, food object, house object] <---this IS possible in Java
		 */
		
		//how do we create an array?
		int[] arry1 = new int[99]; //99 elements in this array
		int[] arry2 = {8, 66, 9, 0, -7}; // 5 elements in this array
			//indices  0   1  2  3  4
		int arry3[] = { 9,0, -7};	//3 elements in this array
		
		//how do I access an array's elements?
		//System.out.println(arry2[1]); //prints 66
		arry2[1] = 88;
		//System.out.println(arry2[1]); //prints 88
		
		//System.out.println(arry2[70]); //will give us an index out of bounds exception
		//System.out.println("length:" + arry1.length);//will display the size of an array
		
		////what is the value of an uninitialized element in an array?
		String[] arry4 = new String[10];
		//System.out.println("uninitialized value: "+arry4[6]);
		
		/*
		 * Let's take a look at the ASCII table....
		 * http://www.asciitable.com/
		 * 
		 * 
		 * If you don't initialize the array with values then each element will take on a default value
		 * 
		 * default values:
		 * int is 0, double is 0.0D, float is 0.0F, short is 0, long is 0L, boolean is false,
		 * byte is 0, char is "empty character", Objects of any type default to "null"
		 */
		
		
		//System.out.println(arry4); //will print the memeory address
		/*
		 * sysout(object or array) will print the hash code + some other default text
		 * 	//for our purposes, assume it is the memory address for now
		 */
		
		int[] intArry1= {0,15,17};
		int[] intArry2= {0,15,17};
		int[] intArry3 = intArry2;
		
		if(intArry3==intArry2) {
			//System.out.println("true, it worked");
		}else {
			//System.out.println("false, it failed");
		}
		
		//System.out.println(intArry3[1]);
		//System.out.println(intArry2[1]);
		
		
		////////////////////////MULTI DIMENSIONAL ARRAYS
		int [][] multiOne = {{0,9},{88,77},{15,-8}};
				//in this case, the outer array happens to have elements of type "int[]" which have elements of type "int"
		int [][] multiTwo = new int[8][4];
		
		/*
		 * doing   int [][] multiTwo = new int[8][];     will create an array of size 8, which each element set to null
		 */
		
		//multiTwo[1]=intArry2;
		//System.out.println(multiTwo[1][3]);
		
		//in this example...which index is the column and which is the row?
		//				which index is the height? which is the width?
		//				which index is the x axis? which is the y axis?
		//				which index is the height? which is the depth?
		//the best you can do is define a, say, column and row then be CONSISTENT
		System.out.println(multiOne[2][0]); //will print 15
		
		System.out.println("length: "+ multiTwo.length);
		System.out.println("length: "+ multiTwo[0].length);
		
		//CAN WE HAVE MORE THAN TWO DIMENSIONS?
		int[][][] array500 = new int[10][12][10];
		int[][][][][][][][][][][][][][][][][][][][] array501= null;
	}
}








