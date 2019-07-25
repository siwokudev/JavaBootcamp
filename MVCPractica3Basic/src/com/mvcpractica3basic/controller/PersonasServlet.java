package com.mvcpractica3basic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcpractica3basic.model.Persona;

@WebServlet("/PersonasServlet")
public class PersonasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona objPersona = new Persona();
		objPersona.setNombre(request.getParameter("txtNombre"));
		objPersona.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
		objPersona.setSalario(Integer.parseInt(request.getParameter("txtSalario")));
		objPersona.setTelefono(request.getParameter("txtTelefono"));
		//objPersona.setEstatura(request.getParameter("txtEstatura"));
		response.setContentType("appliation/json");
		PrintWriter salida = response.getWriter();
		salida.append("{"
				+ " \"nombre\" : \"" + objPersona.getNombre()+"\"+"+","
				+ " \"edad\" : " + objPersona.getEdad() + ","
				+ " \"salario\" : " + objPersona.getSalario() +","
				+ " \"telefono\" : \"" + objPersona.getTelefono()
				+ "\"}");
		salida.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
