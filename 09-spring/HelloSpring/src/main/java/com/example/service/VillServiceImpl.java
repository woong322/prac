package com.example.service;

import java.util.List;

import com.example.model.SuperVillain;
import com.example.repository.VillDao;
import com.example.repository.VillDaoImpl;

public class VillServiceImpl implements VillService {

	///////////STATE
	private VillDao villDao = new VillDaoImpl();
	
	
	
	//////////BUSINESS LOGIC METHODS
	@Override
	public List<SuperVillain> getAllVills() {
		return villDao.selectAll();
	}
	
	//////////CONSTRUCTORS
	public VillServiceImpl() {
	}

	public VillServiceImpl(VillDao villDao) {
		super();
		this.villDao = villDao;
	}
	
	////////GETTERS & SETTERS
	public VillDao getVillDao() {
		return villDao;
	}

	public void setVillDao(VillDao villDao) {
		this.villDao = villDao;
	}
	

}
