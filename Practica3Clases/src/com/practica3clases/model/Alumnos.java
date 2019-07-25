package com.practica3clases.model;

public class Alumnos {
	private String codigoAlumno;
	private String nombreAlumno;
	private double calificacionAlumno;
	
	//el constructor vacio existe por defecto
	//puede omitirse si no se define ningun otro método constructor
	public Alumnos() { 
		
	}
	
	//sobrecarga del metodo constructor
	public Alumnos(String Codigo, String Nombre, double Calificacion) {
		codigoAlumno = Codigo;
		nombreAlumno = Nombre;
		calificacionAlumno = Calificacion;
	}
	
	public String getCodigoAlumno() {
		return codigoAlumno;
	}
	
	public void setCodigoAlumno(String codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
	public double getCalificacionAlumno() {
		return calificacionAlumno;
	}
	
	public void setCalificacionAlumno(double calificacionAlumno) {
		this.calificacionAlumno = calificacionAlumno;
	}
}
