package com.practica8.models;

public class Auto extends Vehicle{
	private int model;
	
	public void giraIzquierda(double ratio) {
		
	}
	
	public void giraDerecha(double ratio) {
		
	}
	
	public int getModel() {
		return model;
	}
	
	public void setModel(int model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Model: " + model; 
		//llamado a la clase padre
	}
	
}
