package main;

import java.util.ArrayList;
import java.util.List;

public class Club {
	private String nombre;
	private String nombreEstadio;
	private int numTitulos;
	private List<Jugador> titulares;
	private List<Jugador> suplentes;
	
	public Club(String nombre, String nombreEstadio, int numTitulos) {
		
		this.nombre = nombre;
		this.nombreEstadio = nombreEstadio;
		this.numTitulos = numTitulos;
		titulares = new ArrayList<Jugador>();
		suplentes = new ArrayList<Jugador>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	public int getNumTitulos() {
		return numTitulos;
	}

	public void setNumTitulos(int numTitulos) {
		this.numTitulos = numTitulos;
	}

	public List<Jugador> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Jugador> titulares) {
		this.titulares = titulares;
	}

	public List<Jugador> getSuplentes() {
		return suplentes;
	}

	public void setSuplentes(List<Jugador> suplentes) {
		this.suplentes = suplentes;
	}

	@Override
	public String toString() {
		
		return "Nombre equipo: "+ this.nombre+ ", Nombre estadio: "+ this.nombreEstadio + ", Numero titulos: "+ this.numTitulos;
	}
	
	
	
	
}
