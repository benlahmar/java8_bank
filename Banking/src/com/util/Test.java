package com.util;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.dao.Dao;
import com.model.Client;
import com.model.Compte;
import com.model.Operation;
import com.model.Operationv;

public class Test {

	public static void main(String[] args) {
		
		Dao dao=new Dao();
		
		
		
//		
//		for(int i=1;i<20;i++)
//		{
//			Client c=new Client(i, "nom"+i, "adresse"+i);
//			dao.addClient(c);
//			dao.addCompteB(i, 0.4, i,c);
//			dao.addOperationV(i, new Date(), i*40+9, i);
//		}
//		
//		
//		SortedSet<Operation> ops = dao.getoperations();
//		
		NavigableSet<Operation> ops1=new TreeSet<>(new OperationCompartorByDate());
		for(int j=1;j<20;j++)
			{
			Operationv e=new Operationv();
			e.setId(j);
			e.setDate(new Date(2020,10,j));
			ops1.add(e);
			
			}
//		
//		Operation d1=new Operationv();
//		d1.setDate(new Date(2020,10,01));
//		Operation d2=new Operationv();
//		d2.setDate(new Date(2020, 10, 12));
//		SortedSet<Operation> res = ops1.subSet(d1, d2);
//			
//		
//		for (Operation o : ops1) {
//				//System.out.println(o.getDate());
//			}
//		
//		SortedSet<Operation> ops4 = ops1.tailSet(d2);
//		for (Operation o : ops4) {
//			System.out.println(o.getDate());
//		}
		
//		Deque<Operationv> dd=new ArrayDeque<>();
//		for(int j=1;j<20;j++)
//		{
//			
//			Operationv e=new Operationv();
//			e.setId(j);
//			e.setDate(new Date(2020,10,j));
//			dd.add(e);
//			
//		}
//		
//		for(Operationv o:dd)
//			System.out.println(o.getDate());
//		System.out.println("**********");
//		Operationv x = dd.getFirst();
//		System.out.println(x.getDate());
		
		
		
//		Map<Client, Set<Compte>> xx;
//		Map<Client, Map<Compte, Operation>> yy;
		
		Map<String, String> map=new HashMap<>();
		for(int i=0;i<10;i++)
			map.put("key"+i, "value"+i);
		
		  System.out.println(map.get("key5"));
		  
		  Set<String> ss = map.keySet();
		  for (String s : ss) {
			System.out.println(map.get(s));
		}
		  
		 
	}

	
	
	
}
