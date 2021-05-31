package com.dev.webthymeleaf.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Role() {
		
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}





/*@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_rol;
	@Column(nullable = false)
	private String rol;
	
	@ManyToOne(cascade = {CascadeType.DETACH,
			CascadeType.DETACH,CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.PERSIST},
			fetch=FetchType.LAZY
)
	@JoinColumn(name="id_usuario")
	private Usuario user_rol;

	public Roles(String rol, Usuario user_rol) {
		super();
		this.rol = rol;
		this.user_rol = user_rol;
	}

	public Roles(String rol) {
		super();
		this.rol = rol;
	}

	public Roles() {
		
	}

	public long getId_rol() {
		return id_rol;
	}

	public void setId_rol(long id_rol) {
		this.id_rol = id_rol;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Usuario getUser_rol() {
		return user_rol;
	}

	public void setUser_rol(Usuario user_rol) {
		this.user_rol = user_rol;
	}

	@Override
	public String toString() {
		return "Roles [id_rol=" + id_rol + ", rol=" + rol + ", user_rol=" + user_rol + "]";
	}
	
	
}*/
