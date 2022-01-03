package com.util;

import java.util.Comparator;

import com.model.Client;

public class ClientComparaison implements Comparator<Client> {

	@Override
	public int compare(Client o1, Client o2) {
		
		return o1.getId()-o2.getId();
	}

}
