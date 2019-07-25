package com.practica8.models;

public class Plane extends Vehicle{
	private double maxAltitud;
	private int maxNroMotores;
	
	public void ascender(double ratio) {
		
	}
	
	public void descender(double ratio) {
		
	}
	
	public double getMaxAltitud() {
		return maxAltitud;
	}
	
	public void setMaxAltitud(double maxAltitud) {
		this.maxAltitud = maxAltitud;
	}
	
	public int getMaxMotores() {
		return maxNroMotores;
	}
	
	public void setMaxMotores(int maxNroMotores) {
		this.maxNroMotores = maxNroMotores;
	}
	
	@Override
	public String toString() {
		return "maxFuel: " + maxFuel 
				+" maxNroPasajeros: " + maxNroPasajeros
				+" velocidad: " + velocidad
				+" maxAltitud: " + maxAltitud
				+" maxNroMotores: " + maxNroMotores; 
		//variable de tipo protected de Vehicle
	}
	
}
