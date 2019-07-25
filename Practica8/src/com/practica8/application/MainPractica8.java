package com.practica8.application;
import com.practica8.models.Vehicle;
import com.practica8.models.Plane;
import com.practica8.models.Auto;

public class MainPractica8 {

	public static void main(String[] args) {
		//Vehicle miVehiculo = new Vehicle(); //error porque vehicle no puede ser instanciado
		
		//polimorfismo
		Vehicle miVehiculo = new Auto(); 
		//miVehiculo = new Plane();
		miVehiculo.setMaxFuel(100);
		miVehiculo.setMaxPasajeros(5);
		miVehiculo.setVelocidad(100);
		((Auto) miVehiculo).setModel(2019); //casting a Auto
		System.out.println(miVehiculo);
		miVehiculo = new Plane();
		((Plane)miVehiculo).setMaxAltitud(10);
		System.out.println(miVehiculo);
		
		
		Auto miAuto = new Auto();
		miAuto.setMaxFuel(100);
		miAuto.setMaxPasajeros(3);
		miAuto.setVelocidad(80);
		miAuto.setModel(2019);
		System.out.println(miAuto);
		
		Plane miPlane = new Plane();
		miPlane.setVelocidad(1000);
		miPlane.setMaxFuel(500);
		miPlane.setMaxPasajeros(40);
		System.out.println(miPlane);
		
		//Vehicle miPlane2 = new Plane();
		
	}

}
