package com.algoritmosentrevistas.model;

public class mainapp {

	public static void main(String[] args) {
		String miPalabra ="murcielagoooo";
		System.out.println("cantidad de vocales: " + algoritmos.cuentaVocales(miPalabra));
		
		int arreglo[] = {1,2,3,4,3,2,1};
		System.out.println(algoritmos.esEspejo(arreglo));
		
		miPalabra = "xxxyyyxxyy";
		
		System.out.println(algoritmos.calculaFactorial(4));
		
		int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(algoritmos.multiplicaDiagonal(matriz));
		
		miPalabra = "{{{}}{{{[(([)])]}}}{{{}}}{{}}[][]()}";
		System.out.println(algoritmos.esCerrada(miPalabra));
		
		System.out.println(algoritmos.ordenaTelefono("CCCC-AAAA-BBBB"));
		
	}

}
