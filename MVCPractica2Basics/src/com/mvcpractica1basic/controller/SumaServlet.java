package com.mvcpractica1basic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Suma dos numeros", urlPatterns = { "/SumaServlet" })
public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("si jala get ");
		//String value = request.getParameter("txtNum2");
		//response.getWriter().append(value);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				
		int num1, num2, resultado;
		num1 = Integer.parseInt(request.getParameter("txtNum1"));
		num2 = Integer.parseInt(request.getParameter("txtNum2"));
		
		resultado = num1 + num2;
		//String value = request.getParameter("txtNum2");
		//response.getWriter().append(String.format("la suma de los numeros es %d", resultado));
		PrintWriter salida =  response.getWriter();
		response.setContentType("text/html"); //MIME type
		
		String miHTML;
		miHTML = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" +
				"<h2>\r\n"+
				"<p>"+
				"la suma de los numeros es: " + resultado +
				"</p>"+
				"</h2>\r\n"+
				"</body>\r\n" + 
				"</html>";
		salida.append(miHTML);

	}

}
