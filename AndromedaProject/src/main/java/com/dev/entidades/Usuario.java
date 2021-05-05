package com.dev.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id_usuario;

	private String nombre;
	private String apellido;
	private String mail;
	private int contrasena;
	
	public Usuario(String nombre, String apellido, String mail, int contrasena) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasena = contrasena;
	}

	public Usuario() {

	}

	public long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getContrasena() {
		return contrasena;
	}

	public void setContrasena(int contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail
				+ ", contrasena=" + contrasena + "]";
	}
	
}
