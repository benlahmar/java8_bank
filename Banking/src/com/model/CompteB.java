package com.model;

public class CompteB extends Compte{

	@Override
	public String toString() {
		return "CompteB [id=" + id + ", solde=" + solde + ", decouvert=" + decouvert + "]";
	}

	public CompteB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteB(int id, double solde, double decouvert, Client client) {
		super(id, solde, decouvert, client);
		// TODO Auto-generated constructor stub
	}

}
