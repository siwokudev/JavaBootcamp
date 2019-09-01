package com.mvcpractica9ajax.model;

/**
 * 
 * @author siwoku
 * @version 1.0
 * @since Aug 2019
 *
 * Est clase me sirve para demostrar el paso de parametros por el metodo POST usando ajax
 */
public abstract class MatematicasAlan {
	/**
	 * 
	 * @param base es la base de la potencia
	 * @param exponente es el exponente de la potencia
	 * @return es el resultado de la potencia de tipo entero calculada
	 */
	public static int calculaPotencia(int base, int exponente) {
		return (int) Math.pow(base, exponente);
	}
}
