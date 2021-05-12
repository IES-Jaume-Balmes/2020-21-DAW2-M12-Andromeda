package com.dev.webthymeleaf.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.webthymeleaf.dao.RepositorioCancion;
import com.dev.webthymeleaf.entidades.Cancion;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class ControladorCancion {

	@Autowired
	private RepositorioCancion cancRep;
	@GetMapping("/canciones")
	public List<Cancion> getAllCancion(){
		return cancRep.findAll();
	}
	
}
