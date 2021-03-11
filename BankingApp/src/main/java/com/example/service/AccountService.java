package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Account;
import com.example.repository.AccountRepository;

public class AccountService {

	private AccountRepository aRepo;

	public List<Account> getAllAccounts() {
		return aRepo.findAll();
	}
	
	public AccountService() {
		// TODO Auto-generated constructor stub
	}


	@Autowired
	public AccountService(AccountRepository aRepo) {
		super();
		this.aRepo = aRepo;
	}

	
	public AccountRepository getaRepo() {
		return aRepo;
	}

	public void setaRepo(AccountRepository aRepo) {
		this.aRepo = aRepo;
	}  
	
	
	
}
