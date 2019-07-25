package com.practica20.app;
import java.util.Scanner;

public class MainPractica20 {

	public static void main(String[] args) {
		Scanner scaner =  new Scanner(System.in);
		
		int edad=0;
		
		System.out.println("Introduce tu edad");
		edad = scaner.nextInt();
		
		assert (edad >= 18):"Edad no valida";
		System.out.println("La edad es: " + edad);

	}

}
