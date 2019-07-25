package com.practica13.application;
import java.

public class MainPractica13 {

	public static void main(String[] args) {
		
		Domicilio miDomicilio = new Domicilio();
		miDomicilio.setCalle("Periferico");
		miDomicilio.setCodigoPostal(58000);
		miDomicilio.setNumero(45);
		
		Empleado miEmpleado = new Empleado();
		miEmpleado.setIdEmpleado(12);
		miEmpleado.setNombreEmpleado("Jani");
		miEmpleado.setDomicilio(miDomicilio);	//dependency injection
		
		
		
	}

}
