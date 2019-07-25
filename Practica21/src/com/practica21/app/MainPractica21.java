package com.practica21.app;

public class MainPractica21 {

	public enum Temporadas{
		PRIMAVERA,
		VERANO,
		OTOÑO,
		INVIERNO
	}
	
	public static void main(String[] args) {
		
		for(Temporadas temporada:Temporadas.values()) {
			System.out.println(temporada);
			//System.out.println(temporada.ordinal());
		}

	}

}
