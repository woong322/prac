package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Pet;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RequestMapping("/api")
@RestController
public class HystrixAndRibbonController {

	//allows our microservice to send and HTTP request
	RestTemplate restTemp = new RestTemplate();
	
	@HystrixCommand(fallbackMethod="sharknado")
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
	
	
	//static pList........
	
	/*
	 * the PURPOSE of the fallback method is so that you have an outlet into
	 * secondary logic.
	 * 
	 * Because you can perform ANY logic that you can think of in a java method, so
	 * whatever logic you can imagine that can help contain the propagation of the
	 * error, you can put in this method. 
	 */
	public List<Pet> sharknado(){
		System.out.println("in sharknado");
		
		List<Pet> pList = new ArrayList<>();
		
		pList.add(new Pet("Gary", "Snail"));
		pList.add(new Pet("Reptar", "Dinosaur"));
		pList.add(new Pet("James Baxtor", "Horse"));
		
		return pList;
	}
	
	
	
	
	
	
	
	
	///////////RIBBON EXAMPLE
	@Autowired
	private LoadBalancerClient loadB;
	
	@GetMapping("/loadbalance")
	public Pet loadBalanceTest() {
		ServiceInstance serviceInstance = loadB.choose("pet-two");
		
		System.out.println(serviceInstance.getUri().toString());
		
		return new Pet("successful", "human words");
	}
}
