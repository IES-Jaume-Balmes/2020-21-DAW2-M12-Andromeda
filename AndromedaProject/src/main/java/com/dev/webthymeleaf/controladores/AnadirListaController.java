package com.dev.webthymeleaf.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.webthymeleaf.dao.RepositorioLista;
import com.dev.webthymeleaf.entidades.Lista_repro;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping(value="/api",produces="application/json", method = {RequestMethod.GET, RequestMethod.PUT,RequestMethod.HEAD,RequestMethod.POST})
public class AnadirListaController {

	@Autowired
	private RepositorioLista listaRep;
	@GetMapping("/add")
	public List<Lista_repro>get(){
		return listaRep.findAll();
	}
	
	
}