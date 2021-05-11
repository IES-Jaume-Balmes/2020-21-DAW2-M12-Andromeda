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
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import org.springframework.data.jpa.repository.Temporal;

@Entity
public class Lista_repro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_lista;
	
	private String nombre_lista;

	private java.util.Date data_creacionDate;
	
	
	@ManyToMany(cascade = { CascadeType.DETACH, 
			CascadeType.MERGE, 
			CascadeType.REFRESH,
						CascadeType.PERSIST }, 
			fetch = FetchType.LAZY)
	@JoinTable(name = "LISTA_DETALLE", 
	joinColumns = @JoinColumn(name = "id_lista"), 
	inverseJoinColumns = @JoinColumn(name = "id_usuario"))
	private List<Usuario> usuarios;

	public Lista_repro(String nombre_lista, Date data_creacionDate) {
		super();
		this.nombre_lista = nombre_lista;
		this.data_creacionDate = data_creacionDate;
	}

	public Lista_repro(String nombre_lista, Date data_creacionDate, List<Usuario> usuarios) {
		super();
		this.nombre_lista = nombre_lista;
		this.data_creacionDate = data_creacionDate;
		this.usuarios = usuarios;
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

	public Date getData_creacionDate() {
		return data_creacionDate;
	}

	public void setData_creacionDate(Date data_creacionDate) {
		this.data_creacionDate = data_creacionDate;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "Lista_repro [id_lista=" + id_lista + ", nombre_lista=" + nombre_lista + ", data_creacion="
				+ data_creacionDate + "]";
	}
	
	
}