package com.practica8.models;

public abstract class Vehicle implements Vehicleable, NavesEspacialesable{ //abstract define una clase no instanciable
	protected double maxFuel; //pueden ser protected
	protected int maxNroPasajeros;
	protected double velocidad;
	
	public void acelerar(double ratio) { //implements de Vehicleable
		velocidad += ratio;
	}
	
	public void desacelerar(double ratio) {
		velocidad -= ratio;
	}
	
	public double getMaxFuel() {
		return maxFuel;
	}
	
	public void setMaxFuel(double maxFuel) {
		this.maxFuel = maxFuel;
	}
	
	public int getMaxPasajeros() {
		return maxNroPasajeros;
	}
	
	public void setMaxPasajeros(int maxNroPasajeros) {
		this.maxNroPasajeros = maxNroPasajeros;
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return "maxFuel: " + maxFuel 
				+" maxNroPasajeros: " + maxNroPasajeros
				+" velocidad: " + velocidad; 
	}
}
