package com.dev.webthymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.webthumeleaf.dto.CancionArtistaDto;
import com.dev.webthymeleaf.entidades.Cancion;


@Repository
public interface RepositorioCancion extends JpaRepository<Cancion,Long>{
	@Query(value = "select cancion, artista, genero from cancion c, artista a, cancion_artista ca where c.id_cancion=ca.id_cancion and ca.id_artista=a.id_artista order by c.cancion;", nativeQuery = true)
    public List<CancionArtistaDto> findByCancionArtistaDtos();
}
