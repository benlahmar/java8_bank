package com.dao;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import com.model.Client;

public interface Idao {

	public void addClient(Client c);
	public void addClient(int id, String nom, String adresse);
	
	public SortedSet<Client> getClients();
	
}
