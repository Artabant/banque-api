package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String nom;
	private String prenom;
	private List<Account> accounts = new ArrayList<>();
	
	public User() {
		
	}
	public User(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public User(String nom, String prenom, List<Account> accounts) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.accounts = accounts;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", accounts=" + accounts + "]";
	}


	
}
