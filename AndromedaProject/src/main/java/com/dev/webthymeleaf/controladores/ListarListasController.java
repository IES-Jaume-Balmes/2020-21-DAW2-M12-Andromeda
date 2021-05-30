package com.dev.webthymeleaf.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.webthumeleaf.dto.ListaDto;
import com.dev.webthymeleaf.dao.RepositorioLista;


@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping(value = "/lista", produces = "application/json", method = { RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.HEAD, RequestMethod.POST })
@RestController
public class ListarListasController {

	@Autowired
	private RepositorioLista listaRep;

	@GetMapping("/mostrar")
	public List<ListaDto> getAllCancion(){
		return listaRep.findByNombreLista();
	}
}