package com.example.day11.threading;

public class MyThread extends Thread{

	@Override
	public void run() {
		/*
		 * the run method acts at the entry point into this thread's logic
		 * JUST like the main method in the main thread
		 */
		for(int i=0; i<50; i++) {
			System.out.println("\t"+Thread.currentThread().getName());
		}
	}
}