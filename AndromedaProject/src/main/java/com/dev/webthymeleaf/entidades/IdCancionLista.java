package com.dev.webthymeleaf.entidades;

/*Esta és la entidad que verifica los datos que se pasan mediante POST
 *en el momento en el que el usuario añade una canción a su lista ya creada*/
public class IdCancionLista {

	private Long id_cancion;
	private Long id_lista;
	
	
	public IdCancionLista(Long id_cancion, Long id_lista) {
		super();
		this.id_cancion = id_cancion;
		this.id_lista = id_lista;
	}
	
	public IdCancionLista() {
	
	}
	public Long getId_cancion() {
		return id_cancion;
	}
	public void setId_cancion(Long id_cancion) {
		this.id_cancion = id_cancion;
	}
	public Long getId_lista() {
		return id_lista;
	}
	public void setId_lista(Long id_lista) {
		this.id_lista = id_lista;
	}
	
}
