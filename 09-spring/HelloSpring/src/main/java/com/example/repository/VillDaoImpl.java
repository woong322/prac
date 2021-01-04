package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.model.SuperVillain;

public class VillDaoImpl implements VillDao {

	@Override
	public List<SuperVillain> selectAll() {
		/*
		 * This method is a MOCK Dao Implementation.
		 * Instead of going to the database, the data has been hardcoded.
		 */
		List<SuperVillain> vills = new ArrayList<>();
		
		vills.add(new SuperVillain("Claire", "Transformation", 220_000));
		vills.add(new SuperVillain("Rain Man", "Super Speed", 210_000));
		vills.add(new SuperVillain("Billy", "He can't tell time", 100_000));
		vills.add(new SuperVillain("Hyde", "Skin Armor", 180_000));
		
		return vills;
	}

}
