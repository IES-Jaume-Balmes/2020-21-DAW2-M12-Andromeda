package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.webthymeleaf.entidades.Lista_repro;
import com.dev.webthymeleaf.entidades.Roles;


@Repository
public interface RepositorioRoles extends JpaRepository<Roles,Long>{
	
}
