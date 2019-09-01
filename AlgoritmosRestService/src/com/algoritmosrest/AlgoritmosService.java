package com.algoritmosrest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/algoritmos")
public class AlgoritmosService {
	
	
	//algoritmo que genere 100 numeros aleatorios
	//y regrese el vector original y el ordenado en un json
	@GET
	@Path("/VectorZeros")
	@Produces(MediaType.TEXT_HTML)
	public String algoritmo1() throws IOException {
		
		String resultado="";
		String propsFileName = "config.properties";
		Random rnd = new Random(System.currentTimeMillis());
		ArrayList<Integer> miArray = new ArrayList<Integer>();
		
		Properties props = new Properties();
		InputStream stream = null;

		stream = getClass().getClassLoader().getResourceAsStream(propsFileName);

		if (stream != null) {
			props.load(stream);
		} else {
			throw new FileNotFoundException("Archivo de propiedades " + propsFileName + " no encontrado");
		}
		
		int cantidadElementos =Integer.parseInt(props.getProperty("CANTIDAD_ELEMENTOS"));
		int limiteSuperior = Integer.parseInt(props.getProperty("LIMITE_SUPERIOR_NUMEROS"));
		
		while(miArray.size() <= cantidadElementos) {
			miArray.add(rnd.nextInt(limiteSuperior));
		}
		
		ArrayList<Integer> miArrayOrdenado = new ArrayList<Integer>(); 
		for(Integer i: miArray) {
			if(i != 0) {
				miArrayOrdenado.add(i);
			}
		}
		
		while(miArrayOrdenado.size() != miArray.size()) {
			miArrayOrdenado.add(0);
		}
		
		Iterator<Integer> miIterador = miArrayOrdenado.iterator();
		while(miIterador.hasNext()) {
			resultado += miIterador.next().toString() + ", ";
		}
		
		return resultado;
	}
	
}
