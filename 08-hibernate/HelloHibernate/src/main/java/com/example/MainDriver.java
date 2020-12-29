package com.example;

import com.example.model.SuperVillain;
import com.example.service.VillService;
import com.example.service.VillServiceImpl;

public class MainDriver {

	public static VillService villServ = new VillServiceImpl();
	
	public static void main(String[] args) {
		insertIntialValues();
		
		//SELECT BY ID
		System.out.println("\nABOUT TO SELECT BY ID");
		System.out.println(villServ.getUsingId(1));
		
		//SELECT BY NAME
		System.out.println("\nABOUT TO SELECT BY NAME");
		System.out.println(villServ.getUsingName("ScreenSlaver"));
		
		//SELECT ALL SUPERVILLAINS
		System.out.println("\nABOUT TO SELECT ALL SUPERVILLAINS");
		System.out.println(villServ.getAllVills());
		
		System.out.println("End of program.");
	}
	
	public static void insertIntialValues() {
		villServ.addVill(new SuperVillain("ScreenSlaver", "Hypnotism", 175_000));
		villServ.addVill(new SuperVillain("Underminer", 
									"I am beneath you, but nothing is beneath me!", 50_000));
		villServ.addVill(new SuperVillain("Joker", "Infectious Laugh", 125_000));
		//let's see what happens with the primary key
		villServ.addVill(new SuperVillain(150,"Mr Freeze", "Freeze Ray", 250_000));
	}

}
