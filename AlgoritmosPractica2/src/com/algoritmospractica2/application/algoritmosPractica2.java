package com.algoritmospractica2.application;

public class algoritmosPractica2 {
	public static void main(String[] args) {
		saludoConNombre("Vladimir");
		sumaNumeros(2,7);
	}
	
	public static void saludo() {
		System.out.println("Hola mundo");
	}
	
	public static void saludoConNombre(String nombre) {
		System.out.println("Hola " + nombre);
	}
	
	public static int sumaNumeros(int numero1, int numero2) {
		int suma = 0;
		suma = numero1 + numero2;
		return suma;
	}
}
