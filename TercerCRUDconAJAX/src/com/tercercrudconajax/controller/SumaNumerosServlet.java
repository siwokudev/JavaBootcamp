package com.tercercrudconajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumaNumerosServlet")
public class SumaNumerosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 =Integer.parseInt(request.getParameter("txtNum1Servlet"));
		int num2 =Integer.parseInt(request.getParameter("txtNum2Servlet"));
		int suma = num1+num2;
		
		response.setContentType("text/html");
		response.getWriter().append(""+suma);
	}

}
