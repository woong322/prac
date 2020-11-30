package com.example.day11.threading;

public class ThreadingExample{

	public static void main(String[] args) throws InterruptedException {
		//How do we create a thread in java?
		Thread th = new Thread();
		
		//this is how we grab a reference to the current thread we're in
		Thread mainThread = Thread.currentThread();
		
		boolean isDaemon = mainThread.isDaemon();
		System.out.println(isDaemon);
		
		Thread.sleep(3000); //3000 milliseconds

		String name = mainThread.getName();
		System.out.println("This is the thread's name: "+ name);
	}

}
