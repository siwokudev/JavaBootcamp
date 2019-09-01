package com.hibernatepractica1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	//@GeneratedValue  //para autoincrementables
	@Column(name = "idProducto")
	private Integer id;

	@Column(name = "nombreProducto")
	private String name;
	
	@Column(name="precioProducto")
	private float price;
	
	@Column(name="existencias")
	private int existence;

	public Producto() {
	}

	public Producto(Integer id, String name, float price, int existence) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.existence = existence;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getExistency() {
		return existence;
	}

	public void setExistency(int existency) {
		this.existence = existency;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", price=" + price + ", existency=" + existence + "]";
	}

}
