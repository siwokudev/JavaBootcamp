package com.practica4.model;

public class OperacionesMatematicas {
	private double numero1;
	private double numero2;
	
	public OperacionesMatematicas() {
		
	}
	
	public OperacionesMatematicas(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public double getNumero1() {
		return numero1;
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public double getNumero2() {
		return numero2;
	}
	
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public int potencia(int base, int exponente) {
		int resultado = base;
		for(int i = 1; i < exponente; i++) {
			resultado *= base;
		}
		return resultado;
	}
	
	public int factorial(int numero) {
		int factorial = 1;
		for(int i=numero;i>1;i--) {
			factorial *= i;
		}		
		return factorial;
	}
	
	public int[] fibonacci(int elementos) {
		int serie[] = new int[elementos];
		int a=0;
		int b=1;
		int fib=b;
		serie[0]=fib;
		for(int i=1;i<elementos;i++) {	
			fib = a+b;
			a = b;
			b = fib;
			serie[i]=fib;
		}
		return serie;
	}
}
