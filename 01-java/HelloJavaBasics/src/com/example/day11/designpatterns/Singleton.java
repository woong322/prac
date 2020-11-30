package com.example.day11.designpatterns;
/*
 * Singleton is a DESIGN PATTERN
 * 
 * it isn't a keyword or syntax in java, it's a way to construct your code to achieve
 * a greater effect
 * 
 * 
 * Another design pattern you should be aware of is the "Factory Design Pattern".
 * The purpose of the factory design pattern is to produce other objects
 * 
 * class Civic {
 * 		public Civic(String make, String model, int doorCount, String color, String trim, String tirebrand, int vin, String radiotype, String fueltype, int fuelGallons, etc.......)
 * 		{
 * 			//initialization logic
 * 		}
 * }
 * 
 * class 4DoorBlueCivicFactory{
 * 		static int vin= blahblahblah;
 * 		//factories can manage complexity of its subject Class
 * 
 * 		public Civic getCivicInstance(String trim, String color){
 * 			return new Civic("Honda", "Civic", 4, color, trim, "FireStone", vin++, etc....);
 * 		}
 * 
 * }
 *
 */
public class Singleton {

	private static Singleton singletonInstance = null;
	
	private Singleton() {
	}
	
	public static Singleton getSingletonInstance() {
		if(singletonInstance == null)
			singletonInstance = new Singleton();
		
		return singletonInstance;
	}
}