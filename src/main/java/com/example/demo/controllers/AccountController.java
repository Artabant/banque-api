package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Account;
import com.example.demo.models.User;



@RestController
@RequestMapping("accounts")
public class AccountController {
	
	private List<Account> accounts = initAccount();
	
	public static List<Account> initAccount(){
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account("compte perso",3000.0));
		accounts.add(new Account("compte preso",2550.0));
		accounts.add(new Account("compte privé",50000.0));
		accounts.add(new Account("compte famille",25000.0));
		return accounts;
	}
	
	@GetMapping()
	public List<Account> findAll(){
		return this.accounts;
	}
	
	@PostMapping("/create")
	public Account create(@RequestBody Account account) {
		this.accounts.add(account);
		return account;
	}
	
	@PostMapping("/{id}/solde/ajouter/{solde}")
	public Account addSolde(@PathVariable int id, @PathVariable double solde) {
		
		return null;
	}

}
