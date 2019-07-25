package com.practica10.application;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainPractica10 {
	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		
		int numero;
		char respuesta = 's';
		//String scanerIn;

		while(respuesta == 's') {
			
			try {
				System.out.println("Dame un numero entero");
				numero = scaner.nextInt();
				System.out.println(String.format("El numero introducido es: %d", numero*numero));
			} catch(InputMismatchException e){
				//e.printStackTrace();
				System.out.println("Entrada no valida");
				
			} finally {
				scaner.nextLine();
			}

			System.out.println("Deseas calcular otro numero?(s/n):");
			respuesta = scaner.next().toLowerCase().charAt(0);
			scaner.nextLine();
		}
		scaner.close();
	} 
}
