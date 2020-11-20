package com.example.day5.finalexample;

/*
 * What does the "final" keyword do in java?
 * 	-it will make the variable immutable (cannot be changed) after it has been assigned.
 * 
 * 
 * Final on:
 * -Final on a variable means the variable is immutable
 * -Final on a method means the method cannot be overridden
 * -Final on a static method means the static method cannot be shadowed
 * -Final on a class means the class cannot be extended
 * 
 * 
 * -no final constructors
 * -no final initializer blocks
 */
public /* final */ class FinalExample {
	//////////////////////////FIELDS
	static final double PI=3.14159;
	
	final int INSTANCE_VARIABLE_THAT_IS_FINAL; //you MUST initialize a final variable.
	final int i = 0;
	
	
	//////////////////////////CONSTRUCTORS AND INITIALIZER BLOCKS
	//no final initializer blocks
	/* final */{
		//INSTANCE_VARIABLE_THAT_IS_FINAL=0; //I can initialize it in a constructor OR initializer block
	}
	
	//no final constructor
	public /* final */ FinalExample() {
		this.INSTANCE_VARIABLE_THAT_IS_FINAL=0;
	}
	public FinalExample(int INSTANCE_VARIABLE_THAT_IS_FINAL) {
		this.INSTANCE_VARIABLE_THAT_IS_FINAL = INSTANCE_VARIABLE_THAT_IS_FINAL; //I can initialize it in a constructor OR initializer block
	}

	/////////////////////////////////////MAIN METHOD
	public static void main(String[] args) {
		
		//PI=15;  //you cannot reassign a final variable's value
		
	}
	
	//////////////////////////////////////METHODS
	 final  void ourMethod() {
		
	}
	 
	 final static void ourStaticMethod() {
		 
	 }
}
