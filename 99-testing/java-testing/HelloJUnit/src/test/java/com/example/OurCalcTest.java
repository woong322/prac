package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/*
 * this is a way to make sure the tests happen in the order they were declared
 * 
 * @FixMethodOrder
 */
public class OurCalcTest {
	
	Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/*
		 * put any test suite initial conditions here
		 */
		System.out.println("----------BEFORE CLASS----------");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		/*
		 * put any test suite clean up logic here
		 */
		System.out.println("----------AFTER CLASS----------");
	}

	@Before
	public void setUp() throws Exception {
		/*
		 * put any per test initial conditions here. Like opening
		 * a fresh DB connection
		 */
		calc= new Calculator();
		System.out.println("-----before each test-----");
	}

	@After
	public void tearDown() throws Exception {
		/*
		 * put cleanup logic here. Like, closing a DB connection
		 */
		System.out.println("-----after each test-----");
	}

	@Test
	public void multiplyTest() {
		//fail("Not yet implemented");
		
		System.out.println("in multiply test");
		
		//assertEquals(String message, int expected, int actual);
		assertEquals("Testing 3x5", 15, calc.multiply(3, 5));
		assertEquals("ourCustomMessage: Testing 5x3", 15, calc.multiply(5, 3));
		assertEquals("Testing 0x200", 0, calc.multiply(0, 200));
		assertEquals("Testing -3x5", -15, calc.multiply(-3, 5));
		assertEquals("Testing -3x-5", 15, calc.multiply(-3, -5));
	
		//let's look at various Assert methods
		//Assert.     <----if you push "." after "Assert" you can see a ton of methods
		//assertTrue(yourCustomTestObject.equals(actualObject));
		
		//what if my return type is void
//		int tempVar = obj.myState + 1;
//		obj.incrementor();
//		assertEquals("Testing state change", tempVar,obj.myState);
	}
	
	@Test
	public void testVoidMethod() {
		int whatTheValueSHOULDBe = calc.myState + 1;
		calc.incrementorVoidMethod();
		assertEquals("Testing state change", whatTheValueSHOULDBe, calc.myState);
	}
	
	@Test
	public void addPositiveNumbersTest() {
		System.out.println("in positive add test");
		
		assertEquals("Testing 5+5", 10, calc.add(5, 5));
		assertEquals("Testing 5+7", 12, calc.add(5, 7));
	}
	
	@Test
	public void addNegativeNumbersTest() {
		System.out.println("in negative add test");
		
		assertEquals("Testing -5+5", 0, calc.add(-5, 5));
		assertEquals("Testing -5+ -7", -12, calc.add(-5, -7));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void manualExceptionTest() {
		System.out.println("inside exception test");
		
		calc.throwingMethod();
	}
	
	@Ignore
	@Test(timeout=3000)
	public void timeTest() {
		System.out.println("inside time test");
		
		calc.timeMethod();
	}

}






