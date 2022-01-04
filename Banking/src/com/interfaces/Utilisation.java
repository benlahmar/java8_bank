package com.interfaces;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

import com.model.Client;

public class Utilisation {

	public static void main(String[] args) {
		
		ICalc addition = (a, b) -> a+b;
		ICalc sous = (a, b) -> a-b;
		ICalc mult = (a, b) -> a*b;
		ICalc div = (a,b)->{ 
			if(b!=0) 
				return a/b;
			else
				return 0;};
		ICalc exp =(a,b)-> (int)Math.pow(a, b);

				
		Calc c=new Calc();
		int a = c.apply(4, 8, addition);
		int s = c.apply(4, 8, sous);
		int m = c.apply(4, 8, mult);
		int d= c.apply(8, 0, div);
		System.out.println(a+"*****"+s+"****"+m+"***"+d);
		
		Function<String, Integer> xx= aa-> aa.length();
		
		//f(g(x))    g(f(h(t(y(x));
		
		System.out.println(xx.apply("Bonjour"));
		
		Function<Client, String> ii=cc->cc.getAdresse().concat(cc.getNom());
		DoubleToIntFunction ff=z-> (int)z;
		System.out.println(ff.applyAsInt(55.8));
	}

}
