package com.example;

import org.springframework.stereotype.Component;

@Component("appProxy")
public class MyAppProxy {

	public MyAppProxy() {
	}
	
	public int drawCartoon(char a, int b, int c) {
		System.out.println("Look up reference art");
		System.out.println("Start up the sick beats, yo");
		
		System.out.println("--- drawing a cartoon! ^_^ --- (15 lines of code");
		
		System.out.println("post on social media");
		System.out.println("clean up work area");
		
		System.out.println("------------------------------");
		return 5;
	}
	
	public int drawAnime(int a) {
		
		System.out.println("Look up reference art");
		System.out.println("Start up the sick beats, yo");
		
		System.out.println("--- drawing YuYuHakuso! :P --- (85 lines of code");
		
		System.out.println("post on social media");
		System.out.println("clean up work area");
		
		System.out.println("------------------------------");
		return 0;
	}
	
	protected void drawNature() {
		System.out.println("Look up reference art");
		System.out.println("Start up the sick beats, yo");
		
		System.out.println("--- drawing some trees *-* --- (35 lines of code");
		
		System.out.println("post on social media");
		System.out.println("clean up work area");
		
		System.out.println("------------------------------");
	}
	
	public void drawSpace() {
		System.out.println("Look up reference art");
		System.out.println("Start up the sick beats, yo");
		
		System.out.println("--- drawing space! >,< --- (20 lines of code");
		
		System.out.println("post on social media");
		System.out.println("clean up work area");
		
		System.out.println("------------------------------");
	}
	
	public void sculptPottery() {
		System.out.println("Look up reference art");
		System.out.println("Start up the sick beats, yo");
		
		System.out.println("--- pot sculpting =0 --- (50 lines of code");
		
		System.out.println("post on social media");
		System.out.println("clean up work area");
		
		System.out.println("------------------------------");
	}
}
