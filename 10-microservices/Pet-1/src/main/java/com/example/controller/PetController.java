package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Pet;

@RestController
@RequestMapping("/api")
public class PetController {

	@GetMapping("/pets")
	public List<Pet> allPets(){
		List<Pet> pList = new ArrayList<>();
		
		pList.add(new Pet("Toothless", "Dragon"));
		pList.add(new Pet("Jake", "The Dog"));
		pList.add(new Pet("Finn", "The Human"));
		pList.add(new Pet("Elohssa", "Horse"));
		pList.add(new Pet("Umasou", "Dinosaur"));
			//Anime movie: "You are Umasou"
		
		System.out.println("getting all pets");
		
		return pList;
	}
}
