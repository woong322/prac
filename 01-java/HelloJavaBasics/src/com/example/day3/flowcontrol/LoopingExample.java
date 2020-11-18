package com.example.day3.flowcontrol;

class A{
}

class B{
}

class LoopingExample {

	public static void main(String[] args) {
		
		/*
		 *   while( [condition] ) {
		 *   	//execute said logic while the condition is true
		 *   }
		 */
		
		////////while loop
		int i=40;
		
		while(i<=3) {
			//up here i=3
			//System.out.println(++i);
			
			//i = i +1;
			
			//tangent: how else can we write i=i+1;?
			//i+=1; //we can also do i-=4; i*=2; i/=6; i%=7;
			//i++; // this is the the post-increment operator
			//++i; // this is the the pre-increment operator
			
		}
		
		
		boolean myBool = true;
		//there could be 700,000 lines of code between these two
//		while(false)
//		{		
//			System.out.println("in infinite while loop");
//		}
		
		
		///////////do while loop
		/*
		 * a while loop that executes at least once BECAUSE the condition is checked at the END of the loop, not the start
		 */
		
		boolean bool2= false;
		
		do {
			//System.out.println("here!");
		}while(bool2);
		
		
		/////////////for loop
		/*
		 *  for( [assignment] ; [condition] ; [assignment]) {
		 *  	//for loop true logic
		 *  }
		 *  
		 *  while loop vs for loop
		 *  for loops are used when you have a countable number of iterations
		 *  while loops are used when you DON'T have a countable number of iterations
		 *  	for example, waiting for a user to hit the esc key
		 */
		for (int j=0; j<3; j++) {
			//System.out.println("j: "+j);
		}
		
//		for(;;) {
//			//THIS is a infinite loop
//		}
		
//		int j=0;
//		for(;j<4;) {
//			//for loops can be used EXACTLY like while loops
//			System.out.println("j: "+j);
//			j++;
//		}
		
//		boolean strangeExample = false;
//		int j=0;
//		for(strangeExample=true, strangeExample=true; j<5; strangeExample=true, strangeExample=true) {
//			//you can have two assignments separated by a comma
//			System.out.println("inside");
//		}
		
		//////enhanced for loop aka for each loop
		/*
		 *   for( [temporary holder variable]   :   [array reference]  )
		 *   {
		 *   		//logic to perform on EACH element of the array
		 *   		//enhanced for loops will AUTOMATICALLY INCREMENT...one time for EACH element in the array (or entity)
		 *   }
		 */
		char arry[] ={7,234,7732,23,23};
		
		for(int myTempVari: arry) {
			System.out.println(myTempVari);
		}
		
		System.out.println("done");
	}
}
