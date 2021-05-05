package com.dev.webthymeleaf.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cancion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id_cancion;
	private String cancion;
	private int id_artista;
	private String genero;
	
	public Cancion(String cancion, int id_artista, String genero) {
		super();
		this.cancion = cancion;
		this.id_artista = id_artista;
		this.genero = genero;
	}

	public Cancion() {
		
	}

	public long getId_cancion() {
		return id_cancion;
	}

	public void setId_cancion(long id_cancion) {
		this.id_cancion = id_cancion;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public int getId_artista() {
		return id_artista;
	}

	public void setId_artista(int id_artista) {
		this.id_artista = id_artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cancion [id_cancion=" + id_cancion + ", cancion=" + cancion + ", id_artista=" + id_artista + ", genero="
				+ genero + "]";
	}
	
}
