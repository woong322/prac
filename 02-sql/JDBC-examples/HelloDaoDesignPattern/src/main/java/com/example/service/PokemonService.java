package com.example.service;

import java.util.List;

import com.example.model.Pokemon;

public interface PokemonService {

	public List<Pokemon> getAllPokemon();
	public Pokemon getPokemon(Pokemon pokemon);
	
	public void accountCreation(String user);
	
	public boolean checkUsernameAndPassword(String u, String p);
	public boolean login(String u, String p);
}
