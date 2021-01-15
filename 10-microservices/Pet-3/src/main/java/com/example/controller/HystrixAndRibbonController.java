package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Pet;

@RequestMapping("/api")
@RestController
public class HystrixAndRibbonController {

	//allows our microservice to send and HTTP request
	RestTemplate restTemp = new RestTemplate();
	
	@GetMapping("/fetchpets")
	public List<Pet> fetchPets(){
		//the purpose of this method will be to retrieve the entire list of pets
		// from another service
		
		System.out.println("in fetchPets()");
		
		@SuppressWarnings("unchecked")
		List<Pet> pList = restTemp.getForObject(
				"http://localhost:9020/api/pets", List.class);
		
		return pList;
	}
	
	
	public List<Pet> sharknado(){
		System.out.println("in sharknado");
		
		List<Pet> pList = new ArrayList<>();
		
		pList.add(new Pet("Gary", "Snail"));
		pList.add(new Pet("Reptar", "Dinosaur"));
		pList.add(new Pet("James Baxtor", "Horse"));
		
		return pList;
	}
}
