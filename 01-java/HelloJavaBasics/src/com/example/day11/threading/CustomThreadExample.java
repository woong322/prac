package com.example.day11.threading;

/*
 * To create a custom thread we must first create a class that extends the Thread class;
 * in our custom thread we must now override the run() method; then instantiate our
 * object and call the start() method.
 * 
 * BUT....there is another way.....
 * 
 * To create a custom thread we can ALSO create a class that implements Runnable;
 * in our custom Runnable we must now override the run() method; then instantiate our object
 * THEN create a new generic Thread class object and pass our custom Runnable into the
 * constructor of the generic Thread object. Finally, call the .start() method on the generic
 * Thread object.
 * 
 * ------------
 * PROS AND CONS OF EACH METHOD OF CREATING A CUSTOM THREAD:
 * 
 * Pros of extending:
 * -less lines of code to "start" the thread
 * -far easier to override the functionality of the Thread class when extending
 * 
 * Pros of implementing:
 * -you do NOT use up the one slot you have to extend another class
 * -lightweight, meaning you don't have to include unwanted methods/baggage
 * 
 */
public class CustomThreadExample {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		//myThread.run(); //calling the run method is just like calling any other method
						//run() is just an average joe method like any other
		myThread.start(); //the START METHOD has special logic that will create a separate process (thread)
					//THEN inside that separate thread it will invoke your run() method
		
		
		MyRunnable myRun = new MyRunnable();
		//myRun.start(); //there IS no start() method in the runnable object
		//myRun.run();
		Thread th = new Thread(myRun);
		th.start();
		
		/*
		 * I could ALSO use lambdas here
		 * 
		 * Thread th = new Thread( *myLambda* );
		 */
		
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}







