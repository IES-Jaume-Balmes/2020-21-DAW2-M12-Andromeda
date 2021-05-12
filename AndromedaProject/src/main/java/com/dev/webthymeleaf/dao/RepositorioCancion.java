package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.webthymeleaf.entidades.Cancion;


@Repository
public interface RepositorioCancion extends JpaRepository<Cancion,Long>{

}
