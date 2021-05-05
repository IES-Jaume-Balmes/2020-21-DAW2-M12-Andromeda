package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dev.webthymeleaf.entidades.Usuario;



public interface RepositorioUsuario extends CrudRepository<Usuario,Long>{

}
