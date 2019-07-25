package com.practica12.application;

public class Mensajes {
	
	private String miMensaje;
	public static String mensajeParaTodos = "Bienvenidos";
	
	public Mensajes() {
		this.miMensaje = "Sin mensaje";
	}
	
	public Mensajes(String  miMensaje) {
		this.miMensaje = miMensaje;
	}
	
	public String diHola() {
		return "Hola Tú";
	}
	
	public String diFriendzone() {
		return "Solo amigos";
	}
	
	public String getMensaje() {
		return miMensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.miMensaje = mensaje;
	}
	
	
}
