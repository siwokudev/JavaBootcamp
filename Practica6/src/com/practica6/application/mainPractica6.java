package com.practica6.application;
import java.util.Random;
import com.practica6.model.AlgoritmosArreglos;;

public class mainPractica6 {

	public static void main(String[] args) {
		final int MAX_ELEMENTS = 10;
		final int TOP_LIMIT = 10;
		int cantidadPares = 0;
		
		int[] vector = new int[MAX_ELEMENTS];
		Random rand = new Random(System.nanoTime());
		
		//pasada 1 - Inicializacion de valores
		for(int i=0;i<vector.length;i++) {
			vector[i] = rand.nextInt(TOP_LIMIT);
		}
		
		//pasada 2 - Proceso
		cantidadPares = AlgoritmosArreglos.pares(vector);
		System.out.println("Cantida de numeros pares en el vector: " + 
		cantidadPares);
		
		//pasada 3 - visualizacion
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i] + " ");
		}

	}

}
