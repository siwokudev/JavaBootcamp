package com.practica11.application;
import java.util.Scanner;

public class MainPractica11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numerador;
		double denominador;
		double resultado;
		
		System.out.println("Introduce el numerador");
		numerador = scanner.nextDouble();
		
		System.out.println("Introduce el denominador");
		denominador = scanner.nextDouble();
		
		try {
			resultado = numerador/denominador;
			System.out.println("El resultado de la division es: "+resultado);
		} catch(ArithmeticException ae) {
			System.out.println("Error, División entre cero");
		}
		
	}

}
