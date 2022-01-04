package com.interfaces;

public class Test {

	public static void main(String[] args) {
		
		IClient byadresse= (clt,ss) -> {
			if(clt.getAdresse().equals(ss))
				return clt;
			else
				return null;
		};
		IClient byname = (clt,dd)->{
			if(clt.getNom().contains(dd))
				return clt;
			else
				return null;
		};
		}

	

}
