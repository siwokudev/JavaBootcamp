package com.hibernatepractica1.controller;

import java.io.IOException;
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

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration cfg = new Configuration();
		SessionFactory miFactory = cfg.configure().buildSessionFactory();
		
		Session miSesion = miFactory.openSession();
		Transaction miTransac = miSesion.beginTransaction();
		
		Producto miProducto = new Producto(
				Integer.parseInt(request.getParameter("txtIdProducto")),
				request.getParameter("txtNombreProducto"),
				Float.parseFloat(request.getParameter("txtPrecioProducto")),
				Integer.parseInt(request.getParameter("txtExistenciaProducto")));
		
		miSesion.update(miProducto);
		
		
		miTransac.commit();
		miSesion.close();
	}

}
