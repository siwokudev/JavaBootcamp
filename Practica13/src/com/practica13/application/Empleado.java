package com.practica13.application;

public class Empleado {
	private int idEmpleado;
	private String nombreEmpleado;
	private Domicilio domicilioEmpleado;
	
	public Empleado() {
		idEmpleado = 0000;
		nombreEmpleado = "Sin nombre";
		//domicilioEmpleado = new Domicilio(); //esto aumenta el acoplamiento, no es correcto en diseño de patrones para un constructor vacio (principios SOLID)
	}
	
	public Empleado(int idEmpleado, String nombreEmpleado, Domicilio domicilioEmpleado) {
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.domicilioEmpleado = domicilioEmpleado;
	}
	
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	
	public Domicilio getDomicilioEmpleado() {
		return domicilioEmpleado;
	}
	
	public void setDomicilio(Domicilio domicilioEmpleado) {
		this.domicilioEmpleado = domicilioEmpleado;
	}
}
