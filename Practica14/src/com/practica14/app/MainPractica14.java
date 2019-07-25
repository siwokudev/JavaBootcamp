package com.practica14.app;
import java.util.ArrayList;
import java.util.Iterator;

public class MainPractica14 {

	public static void main(String[] args) {
		ArrayList<String> miLista = new ArrayList<String>();
		
		miLista.add("Miguel Angle");
		miLista.add("Gerardo");
		miLista.add("Magda");
		miLista.add("Jani");
		
		Iterator miIterator = miLista.iterator();
		
		while(miIterator.hasNext()) {
			System.out.println(miIterator.next());
		}
		
		

	}

}
