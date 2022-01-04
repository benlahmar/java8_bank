package com.interfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import com.model.Client;

public class Exemple {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> d = (s,t)
				->  s.length()+t.length();
			Integer n=d.apply("dd", "abcd");
			System.out.println(n);
			
			
			DoublePredicate gg= r-> r>2;
			System.out.println(gg.test(-44.2));
			
			Supplier<String> f= ()-> "bonjour";
			Supplier<Client> cl= ()-> new Client();
			System.out.println(f.get());
			
			
			Function<Long, Long> lamoitie= a->a/2;
			Function<Long, Long> doubl= a->a*2;
			//gof(  )
			Long res = lamoitie.compose(doubl).apply(7L);
			//fog(  )
			long res2 = lamoitie.andThen(doubl).apply(7L);
			System.out.println(res);
			System.out.println(res2);
			Long res3 = lamoitie.compose(doubl).compose(lamoitie).andThen(doubl).apply(5L);
			
			Consumer<String> ag= q->q.split("-");
			Consumer<String> oo= q->System.out.println(q);
			oo.andThen(ag).accept("ex-rr-ff");
			Supplier<String> up=  String::new;
			Supplier<String> up2= ()-> new String();
			
	}

}
