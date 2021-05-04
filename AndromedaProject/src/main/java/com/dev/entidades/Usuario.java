package com.dev.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long Usuario_id;

	private String Nombre;
	private String Apellidos;
	private String Correo;
	private int Contraseña;

	public Usuario(String nombre, String apellidos, String correo, int contraseña) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Correo = correo;
		Contraseña = contraseña;
	}

	public Usuario() {

	}

	@Override
	public String toString() {
		return "Usuario [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Correo=" + Correo + ", Contraseña="
				+ Contraseña + "]";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public int getContraseña() {
		return Contraseña;
	}

	public void setContraseña(int contraseña) {
		Contraseña = contraseña;
	}

	public long getUsuario_id() {
		return Usuario_id;
	}

	public void setUsuario_id(long usuario_id) {
		Usuario_id = usuario_id;
	}

}
