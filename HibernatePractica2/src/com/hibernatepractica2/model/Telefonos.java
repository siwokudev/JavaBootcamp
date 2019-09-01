package com.hibernatepractica2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefonos")
public class Telefonos {
	
	@Id
	// @GeneratedValue //para autoincrementables
	@Column(name = "idTelefono")
	private String id;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "horario")
	private String horario;

	public Telefonos() {
		super();
	}

	public Telefonos(String id, String telefono, String horario) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.horario = horario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Telefonos [id=" + id + ", telefono=" + telefono + ", horario=" + horario + "]";
	}

}
