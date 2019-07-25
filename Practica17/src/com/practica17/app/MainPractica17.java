package com.practica17.app;
import java.util.Hashtable;
import java.util.Map;

public class MainPractica17 {

	public static void main(String[] args) {
		Hashtable<Integer,String> miHashtable = new Hashtable<Integer,String>();
		
		miHashtable.put(1, "Papa");
		miHashtable.put(2, "Pepe");
		miHashtable.put(3, "Pipi");
		miHashtable.put(4, "Popo");
		miHashtable.put(5, "Pupu");
		
		for(Map.Entry<Integer, String> miEntry:miHashtable.entrySet()) {
			System.out.println(String.format("key: %d ,value: %s", miEntry.getKey(),miEntry.getValue()));
		}

	}

}
