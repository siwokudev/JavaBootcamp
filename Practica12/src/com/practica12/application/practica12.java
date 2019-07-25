package com.practica12.application;


public class practica12 {

	public static void main(String[] args) {
		Mensajes mensaje1 = new Mensajes();
		Mensajes mensaje2 = new Mensajes();
		
		System.out.println("mensaje1: " + mensaje1.diFriendzone());
		System.out.println("mensaje1: " + mensaje1.diHola());
		
		System.out.println("mensaje2: " + mensaje2.diFriendzone());
		System.out.println("mensaje2: " + mensaje2.diHola());

		System.out.println("mensaje static: " + Mensajes.mensajeParaTodos);
		Mensajes.mensajeParaTodos = "Modifico un mensaje static";
		System.out.println("mensaje static: " + Mensajes.mensajeParaTodos);

	}

}
