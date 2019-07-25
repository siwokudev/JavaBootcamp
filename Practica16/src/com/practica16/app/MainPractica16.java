package com.practica16.app;
import java.util.HashMap;
import java.util.Map;;

public class MainPractica16 {

	public static void main(String[] args) {
		HashMap<Integer,String> miHash = new HashMap<Integer, String>();
		miHash.put(1, "Papa");
		miHash.put(2, "Pepe");
		miHash.put(3, "Pipi");
		miHash.put(4, "Popo");
		miHash.put(5, "Pupu");
		
		for(Map.Entry<Integer, String> miEntrada:miHash.entrySet()) {
			System.out.println(String.format("Llave: %d, valor: %s", miEntrada.getKey(),miEntrada.getValue()));
		}

	}

}
