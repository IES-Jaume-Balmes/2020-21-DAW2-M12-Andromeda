package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.webthymeleaf.entidades.Usuario;



public interface RepositorioUsuario extends JpaRepository<Usuario,Long>{

}
