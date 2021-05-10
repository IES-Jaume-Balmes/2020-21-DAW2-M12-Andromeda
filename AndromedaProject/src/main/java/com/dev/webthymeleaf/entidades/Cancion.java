package com.dev.webthymeleaf.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity

public class Cancion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cancion;
	
	private String cancion;
	private String genero;
	
	@ManyToMany(cascade = { CascadeType.DETACH, 
			CascadeType.MERGE, 
			CascadeType.REFRESH,
						CascadeType.PERSIST }, 
			fetch = FetchType.LAZY)
	@JoinTable(name = "CANCION_ARTISTA", 
	joinColumns = @JoinColumn(name = "id_cancion"), 
	inverseJoinColumns = @JoinColumn(name = "id_artista"))
	private List<Artista> artistas;
	
	public Cancion(String cancion, String genero) {
		super();
		this.cancion = cancion;
		this.genero = genero;
	}
	public Cancion() {
	}
	
	
	public Cancion(String cancion, String genero, List<Artista> artistas) {
		super();
		this.cancion = cancion;
		this.genero = genero;
		this.artistas = artistas;
	}
	
	public List<Artista> getArtistas() {
		return artistas;
	}
	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Cancion [id_cancion=" + id_cancion + ", cancion=" + cancion + ", genero=" + genero + ", artistas="
				+ artistas + "]";
	}
	
	
}
