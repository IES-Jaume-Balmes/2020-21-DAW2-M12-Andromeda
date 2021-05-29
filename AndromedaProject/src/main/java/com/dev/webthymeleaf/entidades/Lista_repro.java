package com.dev.webthymeleaf.entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import org.springframework.data.jpa.repository.Temporal;

@Entity
public class Lista_repro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_lista;

	private String nombre_lista;



	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.PERSIST }, fetch = FetchType.LAZY)
	@JoinTable(name = "LISTA_DETALLE", joinColumns = @JoinColumn(name = "id_lista"), inverseJoinColumns = @JoinColumn(name = "id_usuario"))
	private List<User> usuarios;

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.PERSIST }, fetch = FetchType.LAZY)
	@JoinTable(name = "LISTA_CANCION", joinColumns = @JoinColumn(name = "id_lista"), inverseJoinColumns = @JoinColumn(name = "id_cancion"))
	private List<Cancion> canciones;

	public Lista_repro(String nombre_lista) {
		super();
		this.nombre_lista = nombre_lista;
		
	}

	public Lista_repro(String nombre_lista, List<User> usuarios, List<Cancion> canciones) {
		super();
		this.nombre_lista = nombre_lista;
		
		this.usuarios = usuarios;
		this.canciones = canciones;
	}

	public Lista_repro() {

	}

	public long getId_lista() {
		return id_lista;
	}

	public void setId_lista(long id_lista) {
		this.id_lista = id_lista;
	}

	public String getNombre_lista() {
		return nombre_lista;
	}

	public void setNombre_lista(String nombre_lista) {
		this.nombre_lista = nombre_lista;
	}





	public List<User> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<User> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	@Override
	public String toString() {
		return "Lista_repro [id_lista=" + id_lista + ", nombre_lista=" + nombre_lista + ", data_creacion="
				 + "]";
	}

}
