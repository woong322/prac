package com.example.day11.threading;

public class MyRunnable implements  Runnable{

	@Override
	public void run() {
		/*
		 * the run method acts at the entry point into this thread's logic
		 * JUST like the main method in the main thread
		 */
		for(int i=0; i<50; i++) {
			System.out.println("\t|\t"+Thread.currentThread().getName());
		}
		
	}

}
