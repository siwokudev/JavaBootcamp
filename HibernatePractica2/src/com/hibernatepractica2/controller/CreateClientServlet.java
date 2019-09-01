package com.hibernatepractica2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatepractica2.model.Clientes;
import com.hibernatepractica2.model.Telefonos;


@WebServlet("/CreateClientServlet")
public class CreateClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json charset='UTF-8'");
		PrintWriter salida = response.getWriter();
		
		Clientes myClient = new Clientes();
		myClient.setId(request.getParameter("txtIdClient"));
		myClient.setDomicilio(request.getParameter("txtAddressClient"));
		myClient.setEdad(Integer.parseInt(request.getParameter("txtAgeClient")));
		myClient.setNombre(request.getParameter("txtNameClient"));
		//Set<Telefonos> telefonos = new HashSet<Telefonos>();
		//telefonos.add(new Telefonos("8","1632","3pm"));
		//myClient.setListaTelefonos(telefonos);
		
		//creamos el objeto configuration
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session sesion = factory.openSession();
		Transaction transac = sesion.beginTransaction();
		
		
		//System.out.println(myClient.toString());
		//Persistimos el objeto
		sesion.save(myClient);
		transac.commit();
		
		sesion.close();
		salida.close();
	}

}
