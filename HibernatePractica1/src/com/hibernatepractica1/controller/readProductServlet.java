package com.hibernatepractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.hibernatepractica1.model.Producto;

@WebServlet("/readProductServlet")
public class readProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html charset='UTF-8' ");
		PrintWriter salida = response.getWriter();
		Producto miProducto = new Producto();

		
		// creamos el objeto configuration
		Configuration cfg = new Configuration();
		//cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sesionFactory = cfg.configure().buildSessionFactory();
		Session sesion = sesionFactory.openSession();
		Transaction miTransaccion = sesion.beginTransaction();
		//ejecutamos la búsqueda
		String idProducto = request.getParameter("txtIdProducto");
		
		miProducto = sesion.get(Producto.class,Integer.parseInt(idProducto));
		ObjectMapper miJackson = new ObjectMapper();
		String jsonJackson = miJackson.writeValueAsString(miProducto);
		salida.append(jsonJackson);
		/*
		Gson myGson = new Gson();
		salida.append(myGson.toJson(miProducto));
		*/
		
	
		miTransaccion.commit();

		sesion.close();
		salida.close();
		
	}

}
