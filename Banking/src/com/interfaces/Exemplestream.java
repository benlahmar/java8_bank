package com.interfaces;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.model.Client;

public class Exemplestream {

	public static void main(String[] args) {
		List<Client> cs=new ArrayList<>();
		for(int i=0;i<20;i++)
		{
			Client c = new Client(i, "nom"+i, "adresse"+i);
			c.setDate(LocalDate.of(2000+i,10,01));
			cs.add(c);
		}
		
//recuperer les client entre deux dates
//recuperer les client qui habitent a casa
//recuperer les client dont l'age est >10
		LocalDate dd=LocalDate.of(2001, 10, 01); 
		LocalDate df=LocalDate.of(2014,10,01);
		
//		cs.stream()
//		.filter(x -> {
//			LocalDate dac=LocalDate.now();
//		return x.getDate().minusYears(10).isBefore(dac);
//		})
//		.forEach(System.out::println);
		
		cs.stream()
		.filter(x-> x.getAdresse().contains("casa"))
		.forEach(System.out::println);
		
		List<Client> crs=cs.stream()
		.filter(x -> {
			LocalDate dac=LocalDate.now();
			int age=dac.minusYears(x.getDate().getYear()).getYear();
			return age>10;
			})
		.collect(Collectors.toList());
		crs.forEach(x-> System.out.println(x.toString()));
		
		IntSummaryStatistics stats = cs.stream()
		.mapToInt(x-> x.getDate().getYear())
		.summaryStatistics();
		
		System.out.println(stats.getAverage()+"---"+stats.getMax()+"---"+stats.getMin());
		//cs.forEach(x->System.out.println(x));
		//selectionnner les client dont l'id est >12
		//le client le plus ager
		//condition?vari:faux
		Optional<Client> res0 = cs.stream()
			.reduce(
					(a,b)-> 
					a.getDate().isAfter(b.getDate())?a:b
					);
			res0.ifPresent(System.out::println);
		//nullException  -> Optional
		
		List<Client> cres = cs.stream()
				.filter(x-> x.getId()>12)
				.map(r->{ r.setAdresse("ggg");
							return r;})
				
				.collect(Collectors.toList());
		//cres.forEach(System.out::println);
		
		//recuperer les adresse des client
		//jdk 7 , creer une nv list ; boucle , getadresse , add
		Set<String> resa = cs.stream()
			.map(g-> g.getAdresse())
			.distinct()
			.limit(10)
			.collect(Collectors.toSet());
		
		
		//resa.forEach(System.out::println);
		
		
		Map<Integer, String> mapres = cs.stream()
		.filter(x-> x.getId()>10)
		.collect(Collectors.toMap(
				Client::getId
				, 
				Client::getAdresse
				));
		
		mapres.keySet().stream()
		.forEach(x-> System.out.println(mapres.get(x)));
	}
}
