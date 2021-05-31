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
	@Query(value = "select nombre_lista, id_lista from lista_repro", nativeQuery = true)
    public List<ListaDto> findByNombreLista();
	
}

