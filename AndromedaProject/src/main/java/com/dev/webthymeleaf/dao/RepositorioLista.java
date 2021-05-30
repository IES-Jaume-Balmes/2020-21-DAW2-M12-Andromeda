package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.webthumeleaf.dto.CancionArtistaDto;
import com.dev.webthumeleaf.dto.ListaDto;
import com.dev.webthymeleaf.entidades.Lista_repro;

@Repository
public interface RepositorioLista extends JpaRepository<Lista_repro, Long>{
	@Query(value = "select cancion, nombre_lista from cancion c, lista_repro a, lista_cancion ca where c.id_cancion=ca.id_cancion and ca.id_lista=a.id_lista", nativeQuery = true)
    public List<ListaDto> findByNombreLista();
	
}

