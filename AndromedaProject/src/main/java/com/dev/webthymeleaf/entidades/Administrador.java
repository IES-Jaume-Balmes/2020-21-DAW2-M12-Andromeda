package com.dev.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Administrador {
	private int admin_id = 0;
	private String nombre;
	private String apellido;
	private String mail;
	private int contrasena;
	
	public Administrador(int admin_id, String nombre, String apellido, String mail, int contrasena) {
		super();
		this.admin_id = admin_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasena = contrasena;
	}

	public Administrador() {
		
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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
		return "Administrador [admin_id=" + admin_id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail="
				+ mail + ", contrasena=" + contrasena + "]";
	}
	
}
