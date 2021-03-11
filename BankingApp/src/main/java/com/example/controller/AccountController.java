package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.repository.AccountRepository;

@RestController
@RequestMapping("/api")
public class AccountController {
	private AccountRepository aRepo;

	// get all accounts
	@GetMapping("/getAll")
	public List<Account> getAllAccounts() {

		return aRepo.findAll();

	}

	// create a new account
	@PostMapping("/newAccount")
	public String createAccount(@RequestBody Account acc) {
		System.out.println(acc);
		if (acc.getPassword() != null) {
			aRepo.save(acc);
			return "Account has successfully been created!";
		}
		return "Password is required!";
	}

	// withdraw money
	// We need the account id, withdrawal amount
	@PostMapping("/withdraw")
	public Account withdrawMoney(@RequestParam long id, @RequestParam double withdrawalAmount) {
		System.out.println(id);
		Account acc = aRepo.findByAccountId(id);
		acc.setBalance(acc.getBalance() - withdrawalAmount);
		//update the acc in the DB with the new amount 
		aRepo.save(acc);
		return acc;
	}
	
	//deposit money into account 
	@PostMapping("/deposit")
	public Account depositMoney(@RequestParam long id, @RequestParam double depositAmount) {
		System.out.println(id);
		//get the account by the id provided by the user
		Account acc = aRepo.findByAccountId(id);
		acc.setBalance(acc.getBalance() + depositAmount);
		//update the acc in the DB with the new amount 
		aRepo.save(acc);
		return acc;
	}
	
	
	@PostMapping("/transfer")
	public Account transferMoney(@RequestParam long senderId, @RequestParam double transferAmount, @RequestParam long receiverId) {
		Account senderAcc = aRepo.findByAccountId(senderId);
		Account receiverAcc = aRepo.findByAccountId(receiverId);
		
		//withdraw from the sender's accounts
		senderAcc.setBalance(senderAcc.getBalance() - transferAmount);
		//add to the receiver's account
		receiverAcc.setBalance(receiverAcc.getBalance() + transferAmount);
		//update both accounts
		aRepo.save(senderAcc);
		aRepo.save(receiverAcc);
		//return the sender acc with new balance
		return senderAcc;
	}
	
	
	public AccountController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AccountController(AccountRepository aRepo) {
		super();
		this.aRepo = aRepo;
	}

}
