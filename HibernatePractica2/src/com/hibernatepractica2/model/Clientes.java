package com.hibernatepractica2.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	// @GeneratedValue //para autoincrementables
	@Column(name = "idclientes")
	private String id;

	@Column(name = "nombreCliente")
	private String nombre;

	@Column(name = "domicilio")
	private String domicilio;

	@Column(name = "edad")
	private int edad;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "telefono")
	private Set<Telefonos> listaTelefonos;

	public Clientes() {
		super();
	}

	public Clientes(String id, String nombre, String domicilio, int edad, Set<Telefonos> listaTelefonos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.edad = edad;
		this.listaTelefonos = listaTelefonos;
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

	public Set<Telefonos> getListaTelefonos() {
		return listaTelefonos;
	}

	public void setListaTelefonos(Set<Telefonos> listaTelefonos) {
		this.listaTelefonos = listaTelefonos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", domicilio=" + domicilio + ", edad=" + edad
				+ ", listaTelefonos=" + listaTelefonos.toString() + "]";
	}

}
