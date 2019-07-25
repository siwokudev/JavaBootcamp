package com.practica7.application;
import com.practica7.model.Alumnos;;
public class mainPractica7 {

	public static void main(String[] args) {
		Alumnos Miguel = new Alumnos();
		Alumnos Rosa = new Alumnos();
		Alumnos Josue = new Alumnos();
		
		Miguel.setNombre("Miguel Angel");
		Miguel.setDomicilio("Calle 1");
		
		Rosa.setNombre("Rosa");
		Rosa.setDomicilio("Calle 2");
		
		Josue.setNombre("Josue");
		Josue.setDomicilio("Calle 13");
		
		System.out.println("Alumno: " + Miguel.getNombre());
		System.out.println("Domicilio: " + Miguel.getDomicilio());
		System.out.println("Vecindario: " + Miguel.vecindario);
		
		System.out.println("Alumno: " + Rosa.getNombre());
		System.out.println("Domicilio: " + Rosa.getDomicilio());
		Rosa.vecindario = "centro";
		System.out.println("Vecindario: " + Rosa.vecindario);

		System.out.println("Alumno: " + Miguel.getNombre());
		System.out.println("Domicilio: " + Miguel.getDomicilio());
		System.out.println("Vecindario: " + Miguel.vecindario);
	}

}
