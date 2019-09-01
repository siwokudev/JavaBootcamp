package com.springpractica1.model;

public class ClienteBean {
	private String id;
	private String nombre;
	private String domicilio;
	private String telefono;
	private int edad;

	public ClienteBean() {
		System.out.println("------- Objeto Construido -----------");
	}

	public ClienteBean(String id, String nombre, String domicilio, String telefono, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.edad = edad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "ClienteBean [id=" + id + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono
				+ ", edad=" + edad + "]";
	}

}
