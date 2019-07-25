package com.practica3clases.application;
import com.practica3clases.model.Alumnos;

public class practica3Clases {

	public static void main(String[] args) {
		//reservo el espacio de memoria RAM
		Alumnos emmanuel;
		//creo, instancio o concretizo a la clase
		emmanuel = new Alumnos();		
		Alumnos adan = new Alumnos("223456", "Adan",2.5);		
		Alumnos neltzy = new Alumnos("123","Neltzy",3.0);
		
		System.out.println("Codigo de Emmanuel " + emmanuel.getCodigoAlumno());
		System.out.println("Nombre de Emmanuel " + emmanuel.getNombreAlumno());
		System.out.println("Calificacion de Emmanuel " + emmanuel.getCalificacionAlumno());
		
		emmanuel.setNombreAlumno("Emmanuel Guitierrez");

		System.out.println("Codigo de Adan " + adan.getCodigoAlumno());
		System.out.println("Nombre de Adan " + adan.getNombreAlumno());
		System.out.println("Calificacion de Adan " + adan.getCalificacionAlumno());
		
		System.out.println("Codigo de Neltzy " + neltzy.getCalificacionAlumno());
		System.out.println("Nombre de Neltzy " + neltzy.getNombreAlumno());
		System.out.println("Calificacion de Neltzy " + neltzy.getCalificacionAlumno());
		
	}

}

/*
public class Pokemon {
	int nivel;
	String elemento;
	String nombre;
	
	public Pokemon() { //Constructor

	}
	
	public Pokemon(int nivel, String elemento, String nombre) { //Constructor
		this.nivel = nivel;
		this.elemento = elemento;
		this.nombre = nombre;
	}
	
	public void SubirNivel() {
		nivel++;
	}
	
	private void evolucionar() {
		if(nivel > 12) {			
			//evoluciona pokemon
		}
	}
}


public class Pokebola{
	String tipoDeBola;
	boolean vacia;
	Pokemon miPokemon;
	
	public Pokebola() { //Constructor
		tipoDeBola = "normal";
		vacia = false;
		miPokemon = new Pokemon();
	}
	
	public void lanzarPokebola(Pokemon pokemonSalvaje) {
		if(pokemonSalvaje.nivel < 23 && tipoDeBola == "normal") {
			Capturapokemon(pokemonSalvaje);
		} else {
			System.out.println("El pokemon se escapó");
			//Destruye pokebola
		}
	}
	
	public void Capturapokemon(Pokemon pokemonSalvaje) {
		this.miPokemon = pokemonSalvaje;
		vacia = false;
	}
	
}
*/