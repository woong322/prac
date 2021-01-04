package com.example;

import com.example.service.VillService;
import com.example.service.VillServiceImpl;

public class MainDriver {

	private static VillService villServ = new VillServiceImpl();
	
	public static void main(String[] args) {
		System.out.println(villServ.getAllVills());

		System.out.println("end of program");
	}

}
