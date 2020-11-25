package com.example.day8.wrapper;

/*
 * What is a wrapper class?
 * 	Wrapper classes are reference type counterparts to the primitive datatypes.
 * In other words, it's a class that "wraps" itself around a primitive datatype
 * to give a primitive actual functionality.
 * 
 * Each primitive datatype has a wrapper class counterpart:
 * int			Integer
 * double		Double
 * float		Float
 * char			Character
 * boolean		Boolean
 * byte			Byte
 * short		Short
 * long			Long
 */
public class WrapperExample {

	public static void main(String[] args) {
	
		Integer i = new Integer(5);
		Character c= new Character('t');
		Boolean bool  = new Boolean(false);
		//and son on....
		
		Object obj = new Object();
		System.out.println(obj);
		/////////
		System.out.println(i);
		
		//this concept is called "autoboxing"
		//so when a wrapper class is given a primitive then it will AUTOMATICALLY change the primitive into the
		//	appropriate wrapper class for you
		Integer myIntWrap = 99;
		System.out.println(myIntWrap);
		
		//this concept is called "unboxing"
		//	unboxing is the oppositive of autoboxing
		int myPrimInt = myIntWrap;
		System.out.println(myPrimInt);
		
		/*
		 * keep  in mind that wrapper classes have a TON of utility methods that assist with
		 * both the wrapper class and primitive variable versions of that datatype
		 */
		//utility demo
		int i3 = Integer.valueOf("4");
		System.out.println(i3);
		
		int i4 = Integer.parseInt("55");
		System.out.println(i4);
		
		//vice versa
		myIntWrap.toString();
		
		/*
		 * I have a question.....what  is happening here?
		 */
		
		Integer myNum1 = 99;
		Integer myNum2 = 99;
		System.out.println(myNum1==myNum2);
		
		Integer myNum3 = 99;
		Integer myNum4 = new Integer(99);
		System.out.println(myNum3==myNum4);
	}

}
