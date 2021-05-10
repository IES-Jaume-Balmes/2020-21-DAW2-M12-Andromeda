package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.webthymeleaf.entidades.Lista_repro;
import com.dev.webthymeleaf.entidades.Roles;



public interface RepositorioRoles extends JpaRepository<Roles,Long>{
	List<Roles> findAll();
}
