package com.dev.webthymeleaf.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class artista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_artista;
	private String artista;
	private String genero;

	public artista(String artista, String genero) {
		super();
		this.artista = artista;
		this.genero = genero;
	}

	public artista() {

	}

	public int getId_artista() {
		return id_artista;
	}

	public void setId_artista(int id_artista) {
		this.id_artista = id_artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "artista [id_artista=" + id_artista + ", artista=" + artista + ", genero=" + genero + "]";
	}
}
