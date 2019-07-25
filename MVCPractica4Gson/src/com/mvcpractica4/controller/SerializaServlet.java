package com.mvcpractica4.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.mvcpractica4.model.Perro;

@WebServlet("/SerializaServlet")
public class SerializaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String miJson = request.getParameter("txtJson");
		Gson miGson = new Gson();
		
		Perro miPerro = new Perro();
		miPerro = miGson.fromJson(miJson, miPerro.getClass());
		
		
		PrintWriter salida = response.getWriter();
		salida.append("nombre:" + miPerro.getNombre());
		salida.append(" raza:" + miPerro.getRaza());
		salida.append(" edad:" + miPerro.getEdad());
		salida.append(" Fecha de Nacimiento:" + miPerro.getFechaNacimiento().toString());
	}

}
