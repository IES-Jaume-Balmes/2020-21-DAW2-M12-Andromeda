package com.dev.webthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.webthymeleaf.entidades.Lista_repro;

@Repository
public interface RepositorioLista extends JpaRepository<Lista_repro, Long>{
	
}
