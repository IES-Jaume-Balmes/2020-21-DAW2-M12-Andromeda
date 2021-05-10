package com.dev.webthymeleaf.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.webthymeleaf.entidades.Lista_repro;



public interface RepositorioLista_repro extends JpaRepository<Lista_repro,Long>{
	List<Lista_repro> findAll();
//
//    List<Lista_repro> findAll();
}
