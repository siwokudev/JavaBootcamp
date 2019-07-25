package com.practica6.model;

public class AlgoritmosArreglos {
	
	public static int pares(int[] vector) {
		int pares = 0;
		for(int i=0; i<vector.length; i++) {
			if(vector[i]%2 == 0) {
				pares++;
			}
		}
		return pares;
	}
	
}
