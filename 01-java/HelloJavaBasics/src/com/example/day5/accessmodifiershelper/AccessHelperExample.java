package com.example.day5.accessmodifiershelper;

import com.example.day5.accessmodifiers.Clothing;

public class AccessHelperExample extends Clothing {

	void myMethod() {
		//SIMULATING CHILD CLASS
		
		System.out.println(type);
		System.out.println(material);
		//System.out.println(color);//cannot see a default member from the child class
		//System.out.println(cost); //cannot see a private member from the child class

	}
	
	
	
	
	
	public static void main(String[] args) {
		//SIMULATING A NON-CHILD CLASS FROM A DIFFERENT PACKAGE

		Clothing clothing = new Clothing();
		
		System.out.println(clothing.type);
		//System.out.println(clothing.material); //cannot see a protected member from 
												///different package (and not a child class)
		//System.out.println(clothing.color); //cannot see a default member from a different package
		//System.out.println(clothing.cost); //cannot see a private member from a different package
	}

}
