package com.restpractica2;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value = "/mensaje")
public class Mensaje {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public static String diHola() {
		return "Hola fulanito";
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public static String diHola2(@QueryParam("nombre") String nombre) {
		String res = "<html>"
				+ "<head>"
				+ "</head>"
				+ "<body>"
				+ "Hola " + nombre
				+ "</body>"
				+ "</html>";
		return res;
	}
	
	
	@POST
	@Path("cadenas/{cadena}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String invertir(@PathParam("cadena") String nombre) {
		
		String cadena = "";
		int longitud =  nombre.length();
		for(int i=longitud-1; i >= 0 ;i--) {
			cadena += nombre.charAt(i);
		}
		return cadena;
	}
}
