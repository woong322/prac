package com.example.service;

import java.util.List;

import com.example.dao.SuperPrisonDaoImpl;
import com.example.model.SuperPrison;

public class SuperPrisonServiceImpl {

	SuperPrisonDaoImpl prisonDao = new SuperPrisonDaoImpl();
	
	public void addPrison(SuperPrison superPrison) {
		prisonDao.insert(superPrison);
	}
	
	public List<SuperPrison> getAllPrisons(){
		return prisonDao.selectAll();
	}
}
