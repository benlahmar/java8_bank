package com.model;

import java.util.HashSet;
import java.util.Set;

public class Client {

	int id;
	String nom,adresse;
	
	Set<Compte> comptes=new HashSet<>();

	
	
	public Client(int id, String nom, String adresse, Set<Compte> comptes) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.comptes = comptes;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Set<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	
	
}
