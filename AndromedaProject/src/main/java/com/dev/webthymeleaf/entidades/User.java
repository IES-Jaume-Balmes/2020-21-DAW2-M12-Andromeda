package com.dev.webthymeleaf.entidades;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String email;
	
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	
	private Collection<Role> roles;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String email, String password, Collection<Role> roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

}


/*	@Id
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
	
	@OneToMany(mappedBy="user_rol")
	private List<Roles> roles;

	
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
	
	public Usuario(String nombre, long admin_id, String apellido, String mail, String contrasena,
			List<Lista_repro> lista, List<Roles> roles) {
		super();
		this.nombre = nombre;
		this.admin_id = admin_id;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasena = contrasena;
		this.lista = lista;
		this.roles = roles;
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
	public List<Lista_repro> getLista() {
		return lista;
	}
	public void setLista(List<Lista_repro> lista) {
		this.lista = lista;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", admin_id=" + admin_id + ", apellido="
				+ apellido + ", mail=" + mail + ", contrasena=" + contrasena + "]";
	}
	
	
	
	
}*/