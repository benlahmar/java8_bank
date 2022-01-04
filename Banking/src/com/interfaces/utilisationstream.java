package com.interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.model.Client;
import com.model.Compte;
import com.model.CompteB;

public class utilisationstream {

	public static void main(String[] args) {
		
		List<Client> cs=new ArrayList<>();
		
		for(int i=0;i<20;i++)
		{
			Client c = new Client(i, "nom"+i, "adresse"+i);
			c.setDate(LocalDate.of(2000+i,10,01));
			Set<Compte> comptes=new HashSet<>();
			for(int j=1;j<=10;j++)
			{
				Random r=new Random();
				
				CompteB cpt=new CompteB(j, j*r.nextInt(5), r.nextInt(), c);
				comptes.add(cpt);
			}
			c.setComptes(comptes);
			cs.add(c);
		}
		//client id, nom, adresse, comptes
		//cs.forEach(System.out::println);
		
		//recuperer les client qui ont des comptes dont le solde est >4000
		
		cs.stream()
			.map(x-> x.getComptes())
			.flatMap(y-> y.stream()
					.map(z->z.getSolde())
					.filter(e->e>10))
					.forEach(System.out::println);
			
			//afficher les client qui habite a casa 
		//dont le nom est moh
		    //et qui ont un solde >100
		
		Predicate<Client>  byaddre=x-> x.getAdresse().contains("casa");
		Predicate<Client>  bynom = x-> x.getNom().equals("hhh");
		
		cs.stream().filter(byaddre.and(bynom))
		.map(x->x.getComptes())
			.flatMap(y->y.stream()
				.map(z->z.getSolde())
					.filter(t -> t > 100.0))
						.collect(Collectors.toList());
					
		Function<Client, String> dd=x-> x.getNom();
		cs.stream().map(dd);
	//	ICalc ddx =(a,b)-> a*b;
		map( (a,b)-> a*b);
		
	}

	public static double map(ICalc c)
	{
		Calc cl=new Calc();
		return cl.apply(10, 4,c);
	}

	//la liste des operation de Rerait dont le mnt >10000
	
	//la liste des operations entre deux date
	
	//la liste des clients qui ont fait des operations de R
	//entre deux date
	
}
