package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.webthymeleaf.entidades.Usuario;


@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario,Long>{

}
