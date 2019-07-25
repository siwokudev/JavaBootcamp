package com.algoritmospractica1.application;
import java.util.Scanner;

public class algoritmosPractica1Application {

	public static void main(String[] args) {
		
		
		/*
		//operacion de imprimir en pantalla
		System.out.println("Hola mundo");
		*/
		
		/*
		//aceptar entrada de usuario
		Scanner entradaTeclado = new Scanner(System.in);
		String nombre;
		//Mostrar "Dame tu nombre"
		System.out.println("dame tu nombre");
		//Aceptar nombre
		nombre = entradaTeclado.nextLine();
		
		entradaTeclado.close();
		
		System.out.println("El nombre introducido es: " + nombre);
		*/
		
		/*
		double salarioMensual;
		final double SALARIO_MENSUAL_PROMEDIO = 10000;
		System.out.println("Introduce tu salario mensual");
		salarioMensual = entradaTeclado.nextDouble();
		
		if(salarioMensual == 0) {
			System.out.println("Paupérrimo");
		} else if (salarioMensual > 0 
				&& salarioMensual < SALARIO_MENSUAL_PROMEDIO) {
			System.out.println("Salario mínimo");
		} else if (salarioMensual > SALARIO_MENSUAL_PROMEDIO) {
			System.out.println("Salario muy bueno");
		}
		*/
		
		/*
		int repetir;
		String nombre;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame tu nombre");
		nombre = scanner.nextLine();
		System.out.println("Cuantas veces queires repetir tu nombre: ");
		repetir = scanner.nextInt();
		scanner.nextLine(); //limpia el buffer de los int
		
		System.out.println("Ciclo for");
		for(int i=0; i<repetir; i++) {
			System.out.println(nombre);
		}
		
		System.out.println("Ciclo while");
		int index = 0;
		while(index < repetir) {
			System.out.println(nombre);
			index++;
		}
		
		System.out.println("Ciclo DoWhile");
		index = 0;
		do {
			System.out.println(nombre);
			index++;
		}while(index < repetir);
		
		*/
		
		
		//mes del año
		int numeroMes;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("dame el numero del mes del año: ");
		numeroMes = scanner.nextInt();
		
		switch(numeroMes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Numero no valido");
		}
		scanner.nextLine();
		scanner.close();
	}

}
