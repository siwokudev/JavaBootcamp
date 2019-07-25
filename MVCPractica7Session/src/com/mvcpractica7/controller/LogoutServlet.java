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


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		RequestDispatcher miDespachador = request.getRequestDispatcher("link.html");
		
		miDespachador.include(request, response);
		
		HttpSession miSesion = request.getSession(false);
		
		if(miSesion != null) {
			
			
			miSesion.invalidate();
			salida.println("Usiario deslogueado con éxito");

			
		} else {
			
			salida.println("No estas logueado, hazlo por favor");
			miDespachador = request.getRequestDispatcher("link.html");
			miDespachador.include(request, response);
			
		}
		

		
		
		
		
		
		salida.close();
		
		
	}

}
