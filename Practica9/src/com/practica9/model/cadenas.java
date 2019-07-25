package com.practica9.model;

public class cadenas {
	public static char dameCaracterIndice(String cadena, int indice) {
		return cadena.charAt(indice);
	}
	
	public static int dameUnicodeIndice(String cadena, int indice) {
		return cadena.codePointAt(indice);
	}
}
