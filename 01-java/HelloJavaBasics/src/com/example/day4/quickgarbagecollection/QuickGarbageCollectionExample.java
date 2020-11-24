package com.example.day4.quickgarbagecollection;

public class QuickGarbageCollectionExample {

	public static void main(String[] args) {
		int myIndex =0; //but this is NOT when the garbage collector comes
		//System.out.println(myIndex);
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3;
		Object o4= null; 			///o4 wasn't pointing to any objec tto begin with, so no object has lost a reference
		o1= null;	//garbage collector eligible (Enk)
		o3= o2;						///o3 and o2 now point to the same object, that object has TWO references
		o2= null;					///o3's object has lost a reference, but it STILL has one...so no garbage collection
		
		
	}
	//after the main method...o3 no longer exists..meaning that object no longer
			///has a reference...so YES garbage collection
	
	
	static void otherLecture() {
		//System.gc() will CALL the garbage collector
		
		//ACTUALLY System.gc() will SUGGEST to the garbage collector to come get your garbage...it doesn't FORCE
		//		it to
		System.gc();
		
		
		/*								throw & throws
		 * 								Collection & Collections
		 * What is the difference between final, finally, and finalize?
		 * 
		 * Finalize() is a method invoked just before the garbage collector deletes an object
		 */
	}

}
