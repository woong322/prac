package com.example.service;

import java.util.List;

import com.example.dao.PokemonDao;
import com.example.dao.PokemonDaoImpl;
import com.example.model.Pokemon;

public class PokemonServiceImpl implements PokemonService {

	//upcasting helps decouple your code (get rid of spaghetti code)
	private PokemonDao pokeDao = new PokemonDaoImpl(); //upcasting
	
	@Override
	public List<Pokemon> getAllPokemon() {
		//our pre-DB call business logic would go here
		List<Pokemon> myList = pokeDao.selectAllPokemon();
		//our post-DB call business logic would go here
		return myList;
	}

	@Override
	public Pokemon getPokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accountCreation(String user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkUsernameAndPassword(String u, String p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(String u, String p) {
		// TODO Auto-generated method stub
		return false;
	}

}
