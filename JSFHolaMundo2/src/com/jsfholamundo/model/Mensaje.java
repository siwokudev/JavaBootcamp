package com.jsfholamundo.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mensaje")
@SessionScoped
public class Mensaje {
	private String msg;

	public Mensaje() {
		super();
	}

	public Mensaje(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg + " otra cosa";
	}
	
	public String diHola() {
		return "Hola";
	}

	@Override
	public String toString() {
		return "Mensaje [msg=" + msg + "]";
	}

}
