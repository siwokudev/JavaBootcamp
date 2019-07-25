package com.mvcpractica3basic.model;

public class Persona {
	private String nombre;
	private int edad;
	private double salario;
	private String telefono;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
	this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setSalario(double salario) {
	this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
}
