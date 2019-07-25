package com.mvcpractica4.model;

import java.util.Date;

public class Perro {
	private String nombre;
	private String raza;
	private int edad;
	private Date fechaNacimiento;
	
	public Perro(){}
	
	public Perro(String nombre, String raza, int edad, Date fechaNacimiento){
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
