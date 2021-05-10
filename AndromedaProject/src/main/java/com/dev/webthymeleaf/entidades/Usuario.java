package com.dev.webthymeleaf.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_usuario;
	
	private String nombre;
	@Column(nullable = true)
	private long admin_id;
	private String apellido;
	private String mail;
	private String contrasena;
	
	@ManyToMany(mappedBy = "usuarios")
	private List<Lista_repro> lista;
	
	public Usuario(String nombre, String apellido, String mail, String contrasena,
			List<Lista_repro> lista) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasena = contrasena;
		this.lista = lista;
	}
	public Usuario(String nombre, long admin_id, String apellido, String mail, String contrasena,
			List<Lista_repro> lista) {
		super();
		this.nombre = nombre;
		this.admin_id = admin_id;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasena = contrasena;
		this.lista = lista;
	}
	public Usuario(String nombre, long admin_id, String apellido, String mail, String contrasena) {
		super();
		this.nombre = nombre;
		this.admin_id = admin_id;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasena = contrasena;
	}
	public Usuario(String nombre, String apellido, String mail, String contrasena) {
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
	public long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(long admin_id) {
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
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", admin_id=" + admin_id + ", apellido="
				+ apellido + ", mail=" + mail + ", contrasena=" + contrasena + "]";
	}
	
	
	
	
}
