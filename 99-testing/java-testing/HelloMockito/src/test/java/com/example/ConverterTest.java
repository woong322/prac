package com.example;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ConverterTest {
	/*
	 * Mockito will create "mocks" for us to utilize. Mocks are "fake" objects
	 * that Mockito will create that will return a hardcode value without
	 * ACTUALLY calling any other object's methods. We are trying to test
	 * ONLY THIS method, not anyone else's....Mocks are how you accomplish
	 * this.
	 */
	
	Converter conv;
	
	//We should be using Mocks, not hardcode objects
	//ConverterHelperService helpServ = new ConverterHelperService();
	
	ConverterHelperService helpServ = Mockito.mock(ConverterHelperService.class);

	@Before
	public void setUp() throws Exception {
		conv = new Converter(helpServ);
	}

	@Test
	public void test() {
		Mockito.when(helpServ.findMilesToFeetMultipier(8 +100)).thenReturn(5280);
		Mockito.when(helpServ.findMilesToFeetMultipier(5 +100)).thenReturn(5280);
		
		assertEquals("8 miles", 8*5280, conv.howManyFeet(8));
		assertEquals("5 miles", 5*5280, conv.howManyFeet(5));
		
		/*
		 * verify will ceck that the method was called like it was SUPPOSED
		 * to have been
		 */
		Mockito.verify(helpServ, times(1)).findMilesToFeetMultipier(8+100);
		Mockito.verify(helpServ, times(1)).findMilesToFeetMultipier(5+100);
	}

}
