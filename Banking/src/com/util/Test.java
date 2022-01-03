package com.util;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import com.dao.Dao;
import com.model.Client;

public class Test {

	public static void main(String[] args) {
		
		Dao dao=new Dao();
		
		Client c1=new Client(8,"nom5","adresse5");
		Client c2=new Client(12,"nom5","adresse5");
		dao.addClient(c1);
		dao.addClient(c2);
		SortedSet<Client> cs=dao.getClients();
		
		
		cs.tailSet(c2);
		cs.subSet(c1, c2);
		
		
		for(int i=1;i<20;i++)
			dao.addClient(i, "nom"+i, "adresse"+i);
		
		
		
		for (Client c : cs) {
			System.out.println(c.toString());
		}
		System.out.println("*******"+c1.equals(c2));

	}

}
