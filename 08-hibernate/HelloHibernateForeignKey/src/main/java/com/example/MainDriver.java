package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Crime;
import com.example.model.SuperPrison;
import com.example.model.SuperVillain;
import com.example.service.CrimeServiceImpl;
import com.example.service.SuperPrisonServiceImpl;
import com.example.service.VillService;
import com.example.service.VillServiceImpl;
import com.example.util.HibernateUtil;

public class MainDriver {

	/*
	 * COMMON HIBERNATE EXCEPTION
	 * 
	 * -LazyIntializationException
	 */
	
	public static VillService villServ = new VillServiceImpl();
	public static CrimeServiceImpl crimeServ = new CrimeServiceImpl();
	public static SuperPrisonServiceImpl prisonServ = new SuperPrisonServiceImpl();
	
	public static void main(String[] args) {
		insertIntialValues();
		
		//SELECT BY ID
		System.out.println("\nABOUT TO SELECT BY ID");
		System.out.println(villServ.getUsingId(2));
		
		//SELECT BY NAME
		System.out.println("\nABOUT TO SELECT BY NAME");
		System.out.println(villServ.getUsingName("Sonali"));
		
		//SELECT ALL SUPER PRISONS
		System.out.println("\nABOUT TO SELECT ALL SUPER PRISONS");
		System.out.println(prisonServ.getAllPrisons());
		
		//SELECT ALL CRIME
		System.out.println("\nABOUT TO SELECT ALL CRIMES");
		System.out.println(crimeServ.getAllCrimes());
		
		//SELECT ALL SUPERVILLAINS
		System.out.println("\nABOUT TO SELECT ALL SUPERVILLAINS");
		System.out.println(villServ.getAllVills());
		
		HibernateUtil.closeSession();
		System.out.println("End of program.");
	}
	
	public static void insertIntialValues() {
		//SUPER PRISONS
		SuperPrison sprison1 = new SuperPrison("Impel Down", "6 levels, no exits");
		SuperPrison sprison2 = new SuperPrison("Arkham Asylum", "Everyone is...yup, they sure are");
		SuperPrison sprison3 = new SuperPrison("Azkaban", "No one's ever escaped? ");
		SuperPrison sprison4 = new SuperPrison("The Raft", "Marvel Prison");
		
		//CRIMES
		Crime crime1 = new Crime("JayWalking", "Petty Ticket");
		Crime crime2 = new Crime("Aggravated Assault", "Causing bodily harm");
		Crime crime3 = new Crime("Removing the mattress tag", "Only the most evil......");
		Crime crime4 = new Crime("Tax Evasion", "But...Bezos did it! Why can't I?");
		Crime crime5 = new Crime("Bad Animes Jokes", "Wait....but I like these. Dang you Florida.");
		Crime crime6 = new Crime("The Twilight Series", "Those movies are illegal, right?");
		
		
		//VILLAINS
		List<Crime> crimeList = new ArrayList<>();
		crimeList.add(crime3);
		crimeList.add(crime1);
		SuperVillain vill1=
				new SuperVillain("Mark", "Invisibility", 100_000, crimeList, sprison4);
		sprison4.getVillList().add(vill1);
		
		crimeList = new ArrayList<>();
		crimeList.add(crime4);
		SuperVillain vill2=
				new SuperVillain("William", "Shapeshifting", 10, crimeList, sprison3);
		sprison3.getVillList().add(vill2);
		
		crimeList = new ArrayList<>();
		crimeList.add(crime3);
		SuperVillain vill3=
				new SuperVillain("Sonali", "Infatuation", 150_000, crimeList, sprison3);
		sprison3.getVillList().add(vill3);
		
		crimeList = new ArrayList<>();
		crimeList.add(crime2);
		crimeList.add(crime6);
		crimeList.add(crime5);
		SuperVillain vill4=
				new SuperVillain("David", "Mind Control", 1_000_000, crimeList, sprison2);
		sprison2.getVillList().add(vill4);
		
		
		
		
		//DATABASE INSERT
		prisonServ.addPrison(sprison1);
		prisonServ.addPrison(sprison2);
		prisonServ.addPrison(sprison3);
		prisonServ.addPrison(sprison4);
		
		crimeServ.addCrime(crime1);
		crimeServ.addCrime(crime2);
		crimeServ.addCrime(crime3);
		crimeServ.addCrime(crime4);
		crimeServ.addCrime(crime5);
		crimeServ.addCrime(crime6);
		
		villServ.addVill(vill1);
		villServ.addVill(vill2);
		villServ.addVill(vill3);
		villServ.addVill(vill4);
		
		
		
		
//		villServ.addVill(new SuperVillain("ScreenSlaver", "Hypnotism", 175_000));
//		villServ.addVill(new SuperVillain("Underminer", 
//									"I am beneath you, but nothing is beneath me!", 50_000));
//		villServ.addVill(new SuperVillain("Joker", "Infectious Laugh", 125_000));
//		//let's see what happens with the primary key
//		villServ.addVill(new SuperVillain(150,"Mr Freeze", "Freeze Ray", 250_000));
	}

}
