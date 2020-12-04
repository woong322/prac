package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Pokemon;

public class PokemonDaoImpl implements PokemonDao {

	public static String url = "jdbc:postgresql://datachan.c4wt8faaxlgp.us-east-2.rds.amazonaws.com/pokemonDB";
	public static String username= "datachan";
	public static String password="p4ssw0rd";
	
	@Override
	public void insertPokemon(Pokemon poke) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pokemon> selectAllPokemon() {
		//my arraylist
				List<Pokemon> pokes = new ArrayList<>();
				
				try(Connection conn = DriverManager.getConnection(url, username, password)){
					
					String sql = "SELECT * FROM pokemon";
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ResultSet rs = ps.executeQuery(); //<--query not update
					
					while(rs.next()) {
						pokes.add(new Pokemon(rs.getInt(1), rs.getString(2), rs.getString(3),
								rs.getString("pokemon_secondtype")));
					}
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
				
				return pokes;
	}

	@Override
	public Pokemon selectPokemonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon selectPokemonName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePokemon(Pokemon pokemone) {
		// TODO Auto-generated method stub

	}

}
