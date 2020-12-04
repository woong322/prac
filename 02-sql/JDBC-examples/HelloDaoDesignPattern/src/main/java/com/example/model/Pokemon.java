package com.example.model;

public class Pokemon {

	
	//STATE
	private int pokemonId;
	private String pokemonName;
	private String pokemonType;
	private String pokemonSecondType;
	
	/*
	 * no arg constructor
	 * all arg constructor
	 * getters/setters
	 * toString
	 */
	public Pokemon() {
	}

	public Pokemon(int pokemonId, String pokemonName, String pokemonType, String pokemonSecondType) {
		super();
		this.pokemonId = pokemonId;
		this.pokemonName = pokemonName;
		this.pokemonType = pokemonType;
		this.pokemonSecondType = pokemonSecondType;
	}

	public int getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(int pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getPokemonName() {
		return pokemonName;
	}

	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public String getPokemonType() {
		return pokemonType;
	}

	public void setPokemonType(String pokemonType) {
		this.pokemonType = pokemonType;
	}

	public String getPokemonSecondType() {
		return pokemonSecondType;
	}

	public void setPokemonSecondType(String pokemonSecondType) {
		this.pokemonSecondType = pokemonSecondType;
	}

	@Override
	public String toString() {
		return "\nPokemon [pokemonId=" + pokemonId + ", pokemonName=" + pokemonName + ", pokemonType=" + pokemonType
				+ ", pokemonSecondType=" + pokemonSecondType + "]";
	}
}
