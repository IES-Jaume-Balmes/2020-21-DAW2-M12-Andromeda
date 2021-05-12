package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.webthymeleaf.entidades.Cancion;



public interface RepositorioCancion extends JpaRepository<Cancion,Long>{
	public List<Cancion> findAll();
}
