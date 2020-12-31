package com.example.service;

import java.util.List;

import com.example.dao.CrimeDaoImpl;
import com.example.model.Crime;

public class CrimeServiceImpl {

	CrimeDaoImpl crimeDao = new CrimeDaoImpl();
	
	public void addCrime(Crime crime) {
		crimeDao.insert(crime);
	}
	
	public List<Crime> getAllCrimes(){
		return crimeDao.selectAll();
	}
}
