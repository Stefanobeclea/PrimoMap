package it.prova.test;

import java.util.HashMap;
import java.util.Map;

public class ProvaMap {
	public static void main(String[] args) {
		
		//Creo la map di tipo string e integer e con il comando put aggiungo i valori
		Map<String, Integer> insiemeDiNumeriConString = new HashMap<String, Integer>();

		insiemeDiNumeriConString.put("1.3 cc", new Integer(120));
		insiemeDiNumeriConString.put("1.9 cc", new Integer(170));
		insiemeDiNumeriConString.put("2.4 cc", new Integer(210));
		insiemeDiNumeriConString.put("3.0 cc", new Integer(260));

		//faccio un froeach per iterare il mio map e stampo con il comando getkey la stringa e con getValue il numero
		for (Map.Entry<String, Integer> motoriItem : insiemeDiNumeriConString.entrySet()) {
			System.out.print(motoriItem.getKey() + " con HP: ");
			System.out.println(motoriItem.getValue());
		}
		
		System.out.println("##########################################################");
		//faccio un update al mio map
		insiemeDiNumeriConString.put("1.3 cc", new Integer(90));
		
		//faccio la prova con la stampa
		for (Map.Entry<String, Integer> motoriItem : insiemeDiNumeriConString.entrySet()) {
			System.out.print(motoriItem.getKey() + " con HP: ");
			System.out.println(motoriItem.getValue());
		}
		
		System.out.println("##########################################################");
		//Faccio la remove di un elemento
		insiemeDiNumeriConString.remove("3.0 cc");
		
		//verifico con la stampa
		for (Map.Entry<String, Integer> motoriItem : insiemeDiNumeriConString.entrySet()) {
			System.out.print(motoriItem.getKey() + " con HP: ");
			System.out.println(motoriItem.getValue());
		}
	}
}
