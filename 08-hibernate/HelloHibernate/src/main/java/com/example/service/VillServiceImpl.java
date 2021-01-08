package com.example.service;

import java.util.List;

import com.example.dao.VillDao;
import com.example.dao.VillDaoImpl;
import com.example.model.SuperVillain;

public class VillServiceImpl implements VillService {

	//we need to create a VillDao object for the Service to utilize
	///////////////////////
	VillDao villDao = new VillDaoImpl();
	///////////////////////
	
	@Override
	public void addVill(SuperVillain superVillain) {
		//any business logic would go here
		villDao.insert(superVillain);

	}

	@Override
	public List<SuperVillain> getAllVills() {
		//any business logic would go here
		return  villDao.selectAll();
	}

	@Override
	public SuperVillain getUsingId(int id) {
		//any business logic would go here
		return villDao.selectById(id);
	}

	@Override
	public SuperVillain getUsingName(String name) {
		//any business logic would go here
		return villDao.selectByName(name);
	}

}
