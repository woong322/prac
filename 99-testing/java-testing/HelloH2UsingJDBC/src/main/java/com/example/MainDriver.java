package com.example;

import java.util.List;

import com.example.model.Pokemon;
import com.example.service.PokeService;
import com.example.service.PokeServiceImpl;

public class MainDriver {

	public static void main(String[] args) {
		PokeService pokeServ = new PokeServiceImpl();
		
		//CREATING H2 DATABASE TABLE W/ DUMMY DATA
		pokeServ.h2Init();
		
		////checking select by name method in the Dao
		System.out.println("Checking select by name method:\n\t"+pokeServ.getPokemon("squirtle"));
		
		//checking select all pokemon method in the Dao
		List<Pokemon> pokes = pokeServ.getAllPokemon();
		//print the list
		System.out.println("Checking select all method:");
		for(Pokemon p: pokes) {
			System.out.println("\t\t"+p);
		}
		
		
		//DROPPING H2 DATABASE TABLE
		pokeServ.h2Destroy();
		
		System.out.println("done");

	}

}
