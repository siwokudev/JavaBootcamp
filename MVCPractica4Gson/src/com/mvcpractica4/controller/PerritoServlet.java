package com.mvcpractica4.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.mvcpractica4.model.Perro;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

@WebServlet("/PerritoServlet")
public class PerritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Perro miPerrito = new Perro();
		String nombre = request.getParameter("txtNombre");
		miPerrito.setNombre(nombre);
		miPerrito.setRaza(request.getParameter("txtRaza"));
		miPerrito.setEdad(Integer.parseInt( request.getParameter("txtEdad")));
		
		String strFechaNacimiento;
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-DD");
		Date fechaNacimiento = null;
		strFechaNacimiento = request.getParameter("txtFechaNacimiento");
		
		try {
			fechaNacimiento = formateador.parse(strFechaNacimiento);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}		
		miPerrito.setFechaNacimiento(fechaNacimiento);
		
		response.setContentType("application/json");
		Gson miObjetoGson = new Gson();
		
		response.getWriter().append(miObjetoGson.toJson(miPerrito));

		/*
		PrintWriter salida = response.getWriter();
		String salidaJson = "{"
				+ "\"Nombre\" : \"" + miPerrito.getNombre()
				+ "\", \"Fecha de Nacimiento\" : \"" + miPerrito.getFechaNacimiento()
				+ "\", \"Raza\" : \"" + miPerrito.getRaza()
				+ "\", \"Edad\" : " + miPerrito.getEdad()
				+ "}";
		
		salida.append(salidaJson);
		*/
	}

}
