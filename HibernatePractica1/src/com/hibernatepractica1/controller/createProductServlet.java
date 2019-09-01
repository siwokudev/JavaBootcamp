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

import com.hibernatepractica1.model.Producto;

@WebServlet("/createProductServlet")
public class createProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html charset='UTF-8' ");
		response.getWriter().append("Estoy en el atlas");
		PrintWriter salida = response.getWriter();

		Producto miProducto = new Producto();

		miProducto.setId(Integer.parseInt(request.getParameter("txtIdProducto")));
		miProducto.setName(request.getParameter("txtNombreProducto"));
		miProducto.setPrice(Float.parseFloat(request.getParameter("txtPrecioProducto")));
		miProducto.setExistency(Integer.parseInt(request.getParameter("txtExistenciaProducto")));
		
		
		//creamos el objeto configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		//se inicia el objeto sesion
		Session sesion = factory.openSession();
		
		//se inicia la transaccion
		Transaction transac = sesion.beginTransaction();
		
		//Persistimos el objeto
		sesion.persist(miProducto);
		
		transac.commit();
		
		
		sesion.close();
		salida.close();
	}

}
