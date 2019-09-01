package com.restpractica2;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value = "/mensaje")
public abstract class Mensaje {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public static String diHola() {
		return "Hola fulanito";
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public static String diHola(@QueryParam("nombre") String nombre) {
		String res = "<html>"
				+ "<head>"
				+ "</head>"
				+ "<body>"
				+ "Hola " + nombre
				+ "</body>"
				+ "</html>";
		return res;
	}
	
	
}
