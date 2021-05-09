package com.dev.webthymeleaf.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

public class Artista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id_artista;
	
	private String artista;
	@ManyToMany(mappedBy = "artistas")
	private List<Cancion> canciones;
	
	
	public Artista(String artista, List<Cancion> canciones) {
		super();
		this.artista = artista;
		this.canciones = canciones;
	}

	public Artista(String artista) {
		super();
		this.artista = artista;
	}
	
	public Artista() {
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	public long getId_artista() {
		return id_artista;
	}

	public void setId_artista(long id_artista) {
		this.id_artista = id_artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Artista [id_artista=" + id_artista + ", artista=" + artista + ", canciones=" + canciones + "]";
	}

	
	
}
