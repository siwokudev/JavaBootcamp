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

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='UTF-8' ");
		PrintWriter salida = response.getWriter();
		Producto miProducto = new Producto();
		miProducto.setId(Integer.parseInt(request.getParameter("txtIdProducto")));
		
		// creamos el objeto configuration
		Configuration cfg = new Configuration();
		//cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sesionFactory = cfg.configure().buildSessionFactory();
		Session sesion = sesionFactory.openSession();
		Transaction miTransaccion = sesion.beginTransaction();
		
		sesion.delete(miProducto);

		miTransaccion.commit();

		sesion.close();
		salida.close();
	}

}
