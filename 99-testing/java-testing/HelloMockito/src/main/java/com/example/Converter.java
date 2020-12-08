package com.example;

public class Converter {
	
	/*
	 * this is tightly coupled, which makes testing more difficult
	 * ESPECIALLY when dealing with "mocks" and "spies"
	 */
	//ConverterHelperService helpServ= new ConverterHelperService();

	ConverterHelperService helpServ;
	
	public Converter(ConverterHelperService helpServ) {
		this.helpServ = helpServ;
	}
	
	//////////
	
	public int howManyFeet(int miles) {
		int pointlessCalculation = miles;
		pointlessCalculation -=67;
		pointlessCalculation +=70;
		pointlessCalculation -=3;
		
		//return miles *5280;
		return pointlessCalculation * helpServ.findMilesToFeetMultipier(miles+100);
	}
}
