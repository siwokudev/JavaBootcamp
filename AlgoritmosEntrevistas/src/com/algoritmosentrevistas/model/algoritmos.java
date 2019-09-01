package com.algoritmosentrevistas.model;

import java.util.Stack;

public abstract class algoritmos {

	public static int cuentaVocales(String cadena) {
		String aComparar = "aeiou";
		int vocales = 0;
		for (char c : cadena.toLowerCase().toCharArray()) {

			if (aComparar.indexOf(c) != -1) {
				vocales++;
			}
		}
		return vocales;
	}

	public static boolean esEspejo(int a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean estaBalanceada(String cadena) {
		int contador = 0;

		for (char c : cadena.toCharArray()) {
			if (c == 'x')
				contador++;
			else
				contador--;
		}

		if (contador == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static int calculaFactorial(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return calculaFactorial(numero - 1) * numero;
		}
	}

	public static int multiplicaDiagonal(int matriz[][]) {
		int resultado = 1;
		int longitud = matriz.length;
		for (int i = 0; i < longitud; i++) {
			resultado *= (matriz[i][i] * matriz[longitud - 1 - i][i]);
		}
		return resultado;
	}

	public static boolean esCerrada(String cadena) {

		String openers = "{([";
		String closers = "})]";

		char[] cadenaArreglo = cadena.toCharArray();
		Stack<Character> pila = new Stack<Character>();

		for (char c : cadenaArreglo) {
			if (openers.indexOf(c) != -1) { // es un opener, agregalo
				pila.add(c);
			} else if (closers.indexOf(c) != -1) { // es un closer
				if (pila.peek().equals(openers.charAt(closers.indexOf(c)))) {
					pila.pop();
				} else if (pila.empty()) {
					return false;
				} else {
					return false;
				}
			} else { // es un caracter cualquiera
			}
		}
		return true;
	}

	public static String ordenaTelefono(String telefono) {
		String nuevoFormato = "";
		if (!telefono.isEmpty()) {
			for (int i = 4; i < telefono.length(); i++) {
				if (telefono.charAt(i) != '-') {
					nuevoFormato += telefono.charAt(i);
				}
			}
			for (int i = 0; i < 4; i++) {
				nuevoFormato += telefono.charAt(i);
			}
			 /* String[] miArray = telefono.split("-");
			 * if(miArray.length > 1) { nuevoFormato = miArray[1] + miArray[2] + miArray[0];
			 * } else { for(int i=4;i<telefono.length();i++) { nuevoFormato +=
			 * telefono.charAt(i); } for(int i=0;i<4;i++) { nuevoFormato +=
			 * telefono.charAt(i); } }
			 */
		}
		return nuevoFormato;
	}

	public static int[] bubbleSort(int[] arreglo) {
		return null;
	}
}
