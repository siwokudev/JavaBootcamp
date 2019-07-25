package com.mvcpractica1basic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Metodo de envio servlet 2", urlPatterns = { "/HolaServlet" })
public class HolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.getWriter().append(" formulario 2");
		String nombre = request.getParameter("txtNombrecito2");
		
		response.getWriter().append(" Hola " + nombre + " bienvenido al backEnd");
	}

}
