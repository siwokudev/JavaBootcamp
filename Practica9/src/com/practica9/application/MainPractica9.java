package com.practica9.application;
import com.practica9.model.cadenas;
import java.time.LocalTime;

public class MainPractica9 {

	public static void main(String[] args) {
		
		String miString = new String("Hola");
		
		char caracter= cadenas.dameCaracterIndice(miString, 0);
		System.out.println(caracter);
		
		miString = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda.";
		System.out.println(cadenas.dameUnicodeIndice(miString, 0));

		String cad1 =new String("dddd");
		String cad3 = "dddd";
		
		if(cad1.equals(cad3)) { //tratar de no usar == para cadenas
			System.out.println("son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		if(cad1 == cad3) { //tratar de no usar == para cadenas
			System.out.println("son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		System.out.println(miString.indexOf("es"));
		System.out.println(miString.lastIndexOf("es"));
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.now());
		
		String cadenaEvaluar = "micorreo123@correo.com";
		System.out.println(
				cadenaEvaluar.matches("[A-Za-z]+@[A-Za-z]+.[A-Za-z]+"));
		System.out.println(miString.replace('e', 'a'));
		String[] oraciones = miString.split("[,]");
		System.out.println(oraciones.length);
		for(String oracion:oraciones) {
			System.out.println(oracion);
		}
		System.out.println(miString.startsWith("En "));
		System.out.println(miString.substring(10, 20));
		
		char[] charArray = cadenaEvaluar.toCharArray();
		int cont = 0;
		for(int i=0;i<charArray.length;i++) {
			if (charArray[i] == 'e')
				cont++;
		}
		System.out.println("La cantidad de e´s es: " + cont);
		
		System.out.println(String.valueOf(charArray));
		
	}

}
