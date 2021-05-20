package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.webthymeleaf.entidades.Artista;


@Repository
public interface RepositorioArtista extends JpaRepository<Artista,Long>{
	@Query(value = "SELECT u.artista,u.id_artista, r.genero , r.cancion FROM cancion r INNER JOIN artista u ON u.id_artista= r.id_cancion", nativeQuery = true)
    public List<Artista> findByArtista();
}
