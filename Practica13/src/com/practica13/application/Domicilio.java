package com.practica13.application;

public class Domicilio {
	private int numero;
	private int codigoPostal;
	private String calle;
	
	public Domicilio() {
		numero = 000;
		codigoPostal = 000;
		calle = "Sin calle";
	}
	
	public Domicilio(int numero, int codigoPostal, String calle) {
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.calle = calle;
	}
	
	public int getNumeroInterior() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
}
