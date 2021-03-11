package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	@Id
	@Column(name = "account_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountId;
	
	@Column(name = "username", nullable=false)
	private String username;
	
	@Column(name = "password", nullable=false)
	private String password;
	
	@Column(name = "name", nullable=false )
	private String name;
	
	@Column(name = "balance", nullable = false)
	private double balance;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	public Account(long accountId, String username, String password, String name, double balance) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.balance = balance;
	}


	public Account(String username, String password, String name, double balance) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.balance = balance;
	}


	public long getAccountId() {
		return accountId;
	}


	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", password=" + password + ", name="
				+ name + ", balance=" + balance + "]";
	}

	
	
}
