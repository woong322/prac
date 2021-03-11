package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

	public List<Account> findAll();
	public Account findByAccountId(long id);
}
