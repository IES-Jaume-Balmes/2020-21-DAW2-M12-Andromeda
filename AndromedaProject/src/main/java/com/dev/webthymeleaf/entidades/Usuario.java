package com.dev.webthymeleaf.entidades;

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
	private int admin_id = 0;
	private String apellido;
	private String mail;
	private String contrasena;
	
	
	
	public Usuario(long id_usuario, String nombre, int admin_id, String apellido, String mail, String contrasena) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.admin_id = admin_id;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasena = contrasena;
	}
	
	public Usuario() {
		super();
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
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
