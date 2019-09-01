package com.mvcpratica9ajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcpractica9ajax.model.MatematicasAlan;
/**
 * 
 * @author siwoku
 * @version 1.0
 * @since Aug 2019
 *
 */

/**
 * 
 * Este servlet hace uso de la clase MatematicaAlan para realizar el calculo de la potencia
 *
 */
@WebServlet("/CalculaPotenciaServlet")
@MultipartConfig
public class CalculaPotenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * este metodo adquiere el valor de la base y el exponente desde el frontEnd
	 * 
	 * @param request es el objeto request de mi servlet
	 * @param response es el objeto response de mi servlet
	 * @return No genera ningún valor en el return porque crea la salida en el objeto response
	 * @see respose.getWriter().append();
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("servlet funcionando");
		
		int base =Integer.parseInt( request.getParameter("txtBase"));
		int exponente = Integer.parseInt( request.getParameter("txtExponente"));	
		int potencia = MatematicasAlan.calculaPotencia(base, exponente);
		
		response.setContentType("text/html");
		response.getWriter().append("La potencia es: " + potencia);
	}

}
