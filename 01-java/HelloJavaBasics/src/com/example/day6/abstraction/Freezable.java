package com.example.day6.abstraction;

public interface Freezable extends Meltable, Edible {

	default void ourDefaultMethod(/* int i */) {
		//In Java 8 you CAN have concrete implemention in a method.....IF you use the "default" keyword
		System.out.println("from the SECOND interface's default logic");
	}
}
