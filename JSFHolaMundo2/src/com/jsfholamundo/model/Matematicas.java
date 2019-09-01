package com.jsfholamundo.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mates")
@SessionScoped
public class Matematicas {
	private int numero1;
	private int numero2;
	public Matematicas() {
		super();
	}
	public Matematicas(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int sumaNumeros() {
		return numero1 + numero2;
	}
	@Override
	public String toString() {
		return "Matematicas [numero1=" + numero1 + ", numero2=" + numero2 + "]";
	}
	
	
}
