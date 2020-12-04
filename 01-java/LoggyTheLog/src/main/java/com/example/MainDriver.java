package com.example;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
/*
 * LOGGING LEVELS INCLUDE
 * 
 * (lowest priority)					(highest priority)
 * ALL < debug < info < warn < error < fatal < off
 * 
 * also, you ARE able to create your own custom logging levels
 */
public class MainDriver {

	final static Logger loggy = Logger.getLogger(MainDriver.class);
	
	public static void main(String[] args) {
		//loggy.setLevel(Level.ALL);
		loggy.setLevel(Level.ERROR);
		
		
		if(loggy.isInfoEnabled()) {
			loggy.info("This is info: loggers are cool, right? Sugoi!!!!");
		}
		
		loggy.warn("This is a warning: it comes for me at dawn.....");
		loggy.error("This is an error: pineapples don't go on pizza......",
				new IndexOutOfBoundsException());
		loggy.fatal("This is fatal...like the Dragonballz live action movie...");
		loggy.info("--------------------------------------------");

	}

}
