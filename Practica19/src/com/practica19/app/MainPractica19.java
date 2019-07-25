package com.practica19.app;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class MainPractica19 {

	public static void main(String[] args) {
		
		PriorityQueue<String> miCola = new PriorityQueue<String>();
		
		miCola.add("Magda");
		miCola.add("Neltzy");
		miCola.add("Omar");
		miCola.add("Emma");
		miCola.add("Jesus");
		miCola.add("Nicole");
		
		while(!miCola.isEmpty()) {
			System.out.println(miCola.poll());
		}
		
		PriorityQueue<Integer> miColaEnteros = new PriorityQueue<Integer>();
		miColaEnteros.add(12);
		miColaEnteros.add(52);
		miColaEnteros.add(89);
		miColaEnteros.add(23);
		miColaEnteros.add(97);
		miColaEnteros.add(123);
		
		while(!miColaEnteros.isEmpty()) {
			System.out.println(miColaEnteros.remove());
		}
		
		ArrayDeque<Integer> miDeque =  new ArrayDeque<Integer>();
		miDeque.add(12);
		miDeque.add(432);
		miDeque.add(32);
		miDeque.add(89);
		miDeque.add(76);
		
		while(!miDeque.isEmpty()) {
			System.out.println(miDeque.poll());
		}

	}

}
