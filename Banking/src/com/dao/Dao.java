package com.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.model.Client;
import com.util.ClientComparaison;

public class Dao implements Idao{

	public static SortedSet<Client> clients=new TreeSet<>(new ClientComparaison());
	
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

	

	
}
