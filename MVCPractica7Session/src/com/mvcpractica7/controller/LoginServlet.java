package com.mvcpractica7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		//request.getRequestDispatcher("link.html").include(request, response);
		
		RequestDispatcher despachador = request.getRequestDispatcher("link.html");
		despachador.include(request, response);
		
		String nombreForm = request.getParameter("txtNombre");
		String contraseņa = request.getParameter("txtPassword");
		
		if(nombreForm.equals("admin") && contraseņa.equals("admin")) {
			salida.println("bienvenido " + nombreForm);
			HttpSession miSesion = request.getSession();
			miSesion.setAttribute("nombre", nombreForm);
		} else {
			salida.println("Sorry, usuario y contraseņa equivocados");
			despachador = request.getRequestDispatcher("index.html");
			despachador.include(request, response);
		}
		
		salida.close();
		
	}

}
