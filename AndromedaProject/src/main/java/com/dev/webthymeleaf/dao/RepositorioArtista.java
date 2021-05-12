package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.webthymeleaf.entidades.Artista;


@Repository
public interface RepositorioArtista extends JpaRepository<Artista,Long>{

}
