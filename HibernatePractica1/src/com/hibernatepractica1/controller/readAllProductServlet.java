package com.hibernatepractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.hibernatepractica1.model.Producto;

@WebServlet("/readAllProductServlet")
public class readAllProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		Configuration cfg = new Configuration();
		SessionFactory fct = cfg.configure().buildSessionFactory();
		Session sssn = fct.openSession();
		Transaction trnsc = sssn.beginTransaction();

		//Read deprecada
		/*
		@SuppressWarnings("deprecation")
		Criteria criteria = sssn.createCriteria(Producto.class);
		ArrayList<Producto> productos = (ArrayList<Producto>) criteria.list();
		*/
		
		//nueva forma
		CriteriaQuery<Producto> cq = sssn.getCriteriaBuilder().createQuery(Producto.class);
   		cq.from(Producto.class);
   		ArrayList<Producto> productos = (ArrayList<Producto>) sssn.createQuery(cq).getResultList();
   		
   		Gson myJson = new Gson();
		out.append(myJson.toJson(productos));
		
		trnsc.commit();
		sssn.close();
		out.close();
	}

}
