package com.practica5.application;
import java.util.Random;

public class practica5 {

	public static void main(String[] args) {
		
		final int MAX_ELEMENTOS = 100;
		int[] arregloEnteros = new int[MAX_ELEMENTOS];
		double[] arregloDouble = new double[MAX_ELEMENTOS];
		char[] arregloChar = new char[MAX_ELEMENTOS];
		String[] arregloCadenas = new String[MAX_ELEMENTOS];
		boolean[] arregloBooleanos = new boolean[MAX_ELEMENTOS];
		
		//Generacion de números pseudoaleatorios
		Random rand = new Random(System.nanoTime());
		
		/*
		double miNumeroAleatorio = 0.0;
		miNumeroAleatorio = rand.nextDouble();
		System.out.println(miNumeroAleatorio);
		*/
		double media=0;
		for(int i=0 ; i<arregloEnteros.length; i++) {
			arregloEnteros[i] = rand.nextInt(20) + 50; //del 50 al 70
			//arregloDouble[i] = rand.nextDouble();
			media += arregloEnteros[i];
		}
		media /= arregloEnteros.length;
		System.out.println("La media es: " + media);
		
		
		
		for(int i=0 ; i<arregloEnteros.length; i++) {
			System.out.print(arregloEnteros[i] +" ");
			//arregloDouble[i] = rand.nextDouble();
		}
		
	}

}
