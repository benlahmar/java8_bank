package com.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Compte {

	int id;
	double solde;
	double decouvert;
	
	Client client;
	List<Operation> operations=new ArrayList<>();
	

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(int id, double solde, double decouvert, Client client) {
		super();
		this.id = id;
		this.solde = solde;
		this.decouvert = decouvert;
		this.client = client;
	}
	
	
}
