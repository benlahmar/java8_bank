package com.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import com.model.Client;
import com.model.Compte;
import com.model.Operation;

public interface Idao {

	public void addClient(Client c);
	public void addClient(int id, String nom, String adresse);
	
	public SortedSet<Client> getClients();
	
	
	public void addCompte(Compte c, int idclient);
	public void addCompteE(int id,double solde,double decouvert,double taux, int idclient);
	public void addCompteB(int id,double solde,double decouvert, Client client);

	
	public void addOperationV(int id, Date date, double mnt, int idcompte);
	public void addOperationR(int id, Date date, double mnt, int idcompte);
	
	public void addOperation(int id, Date date, double mnt,String type, int idcompte);

	
	public SortedSet<Operation> getoperations(int idcompte);
	public SortedSet<Operation> getoperations();

}
