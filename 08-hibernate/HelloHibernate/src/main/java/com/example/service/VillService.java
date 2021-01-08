package com.example.service;

import java.util.List;

import com.example.model.SuperVillain;

public interface VillService {

	public void addVill(SuperVillain superVillain);
	
	public List<SuperVillain> getAllVills();
	public SuperVillain getUsingId(int id);
	public SuperVillain getUsingName(String name);
}
