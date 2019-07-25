package com.junitpractica1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junitpractica1.model.Operaciones;

public class OperacionesTest {

	@Test
	public void testSumaEnteros() {
		Operaciones operaciones = new Operaciones();
		
		int resultadoReal;
		int resultadoEsperado = 20;
		resultadoReal = operaciones.sumaEnteros(10, 10);
		assertEquals(resultadoEsperado,resultadoReal);
		
		assertEquals(4,operaciones.sumaDoubles(1.99, 2.0),0.1);
		
		//probar los dem�s aserts y ciclos con aserts
	}

}
