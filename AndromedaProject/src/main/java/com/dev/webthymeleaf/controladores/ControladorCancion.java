package com.dev.webthymeleaf.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.webthymeleaf.dao.RepositorioArtista;
import com.dev.webthymeleaf.dao.RepositorioCancion;
import com.dev.webthymeleaf.dto.CancionArtistaDto;
import com.dev.webthymeleaf.entidades.Artista;
import com.dev.webthymeleaf.entidades.Cancion;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping(value="/api",produces="application/json", method = {RequestMethod.GET, RequestMethod.PUT,RequestMethod.HEAD,RequestMethod.POST})
public class ControladorCancion {

	@Autowired
	private RepositorioCancion cancRep;
	@GetMapping("/canciones")
	public List<CancionArtistaDto> getAllCancion(){
		return cancRep.findByCancionArtistaDtos();
	}
	
	@Autowired
	private RepositorioArtista artRep;
	@GetMapping("/artistas")
	public List<Artista> getAllartista(){
		return artRep.findAll();
	}
}