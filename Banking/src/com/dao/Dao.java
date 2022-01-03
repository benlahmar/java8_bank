package com.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.model.Client;
import com.model.Compte;
import com.model.Operation;
import com.util.ClientComparaison;
import com.util.OperationCompartorByDate;

public class Dao implements Idao{

	public static SortedSet<Client> clients=new TreeSet<>(new ClientComparaison());
	public static Set<Compte> comptes=new HashSet<>();
	public static SortedSet<Operation> operations=new TreeSet<>(new OperationCompartorByDate());
	
	
	public void addClient(Client c) {
		
		clients.add(c);
	}

	public void addClient(int id, String nom, String adresse) {
		
		Client c=new Client(id, nom, adresse);
		clients.add(c);
		
	}

	@Override
	public SortedSet<Client> getClients() {
		// TODO Auto-generated method stub
		return clients;
	}

	@Override
	public void addCompte(Compte c, int idclient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCompteE(int id, double solde, double decouvert, double taux) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCompteB(int id, double solde, double decouvert, int idclient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOperationV(int id, Date date, double mnt, int idcompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOperationR(int id, Date date, double mnt, int idcompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOperation(int id, Date date, double mnt, String type, int idcompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SortedSet<Operation> getoperations(int idcompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<Operation> getoperations() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
