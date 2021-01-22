package com.example.demo.models;

public class Account {
	
	private String libelle;
	private double solde;
	
	public Account() {
		
	}
	public Account(String libelle, double solde) {
		super();
		this.libelle = libelle;
		this.solde = solde;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Account [libelle=" + libelle + ", solde=" + solde + "]";
	}
	
}
