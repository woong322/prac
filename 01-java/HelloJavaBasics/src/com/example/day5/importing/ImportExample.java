package com.example.day5.importing;

//the "import" keyword brings other classes/entities into THIS file's "scope"

//we can import individual entities
import com.example.day4.classes.Animal;
import com.example.day4.classes.Car;

//the "*" is a wildcard that will import all entities from the given package
//import com.example.day4.classes.*;
import com.example.day4.inheritance.*;

//this imports SPECIFICALLY the static members of a class
import static com.example.day4.moreprecedence.MoreOnPrecedenceExample.*;

public class ImportExample {

	public static void main(String[] args) {

		
		Car car = new Car();
		Animal animalFromClassesPackage = new Animal();
		
		
		//we can ALSO "import" using the full qualifier name of the object (package1.package2.package3.class)
		//com.example.day4.classes.Animal animalFromClassesPackage = new com.example.day4.classes.Animal();
		com.example.day4.inheritance.Animal animalFromInheritancePackage = new com.example.day4.inheritance.Animal();
	}

}
