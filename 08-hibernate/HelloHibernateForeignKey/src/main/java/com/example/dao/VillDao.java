package com.example.dao;

import java.util.List;

import com.example.model.SuperVillain;

public interface VillDao {

	//CRUD OPERATIONS
	public void insert(SuperVillain superVillain);
	public void update(SuperVillain superVillain);
	public void delete(SuperVillain superVillain);
	
	public SuperVillain selectById(int id);
	public SuperVillain selectByName(String name);
	public List<SuperVillain> selectAll();
}
