package com.example.dao;

import java.util.List;

import com.example.model.Pokemon;

public interface PokemonDao {

	//CRUD METHODS ONLY
	
	//CREATE
	public void insertPokemon(Pokemon poke);
	//READ
	public List<Pokemon> selectAllPokemon();
	public Pokemon selectPokemonById(int id);
	public Pokemon selectPokemonName(String name);
	//UPDATE
	public void updatePokemon(Pokemon pokemon);
	//DELETE
	public void deletePokemon(Pokemon pokemone);
}
