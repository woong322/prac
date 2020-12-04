package com.example;

import java.util.List;

import com.example.model.Pokemon;
import com.example.service.PokemonService;
import com.example.service.PokemonServiceImpl;

public class MainDriver {

	public static void main(String[] args) {
		PokemonService pokeServ = new PokemonServiceImpl();//upcasting
		
		List<Pokemon> pokes = pokeServ.getAllPokemon();
		
		for(Pokemon p: pokes) {
			System.out.println(p);
		}

	}

}
