package com.example.dao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.model.Pokemon;

public class PokeDaoTest {
	
	private static PokeDao pokeDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pokeDao = new PokeDaoImpl("jdbc:h2:./testDBFolder/testData", "sa", "sa");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		pokeDao.h2InitDao();
	}

	@After
	public void tearDown() throws Exception {
		pokeDao.h2DestroyDao();
	}

	@Test
	public void selectByNameTest() {
		Pokemon poke = pokeDao.selectPokemonByName("squirtle");
		
		assertEquals("squirtle", poke.getPokemon_name());
		assertEquals("water", poke.getPokemon_type());
		assertEquals(7, poke.getPokemon_id());
	}

}
