package com.practica4.application;
import com.practica4.model.OperacionesMatematicas;
import java.util.Scanner;

public class Practica4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Dame un numero");
		num1 = Double.parseDouble( scanner.nextLine());
		
		System.out.println("Dame otro numero");
		num2 = Double.parseDouble(scanner.nextLine());
		
		OperacionesMatematicas objOperaciones;
		objOperaciones = new OperacionesMatematicas(num1, num2);
		
		System.out.println("Su factorial es: " + 
		objOperaciones.factorial((int)num2));
		
		System.out.println("Dame una base: ");
		num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Dame un exponente: ");
		num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println(num1+ "a la potencia " + num2 + " es " +
		objOperaciones.potencia((int)num1,(int)num2));
		
		System.out.println("Dame un numero para fibonacci");
		num1 = Double.parseDouble(scanner.nextLine());
		int serie[] = objOperaciones.fibonacci((int)num1);
		for(int i=0;i<serie.length;i++) {
			System.out.println(serie[i]);
		}
	}	

}
