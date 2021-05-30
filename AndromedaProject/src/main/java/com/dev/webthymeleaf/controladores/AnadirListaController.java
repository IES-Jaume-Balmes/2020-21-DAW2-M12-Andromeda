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

import com.dev.webthumeleaf.dto.CancionArtistaDto;
import com.dev.webthumeleaf.dto.ListaDto;
import com.dev.webthymeleaf.dao.RepositorioCancion;
import com.dev.webthymeleaf.dao.RepositorioLista;

import com.dev.webthymeleaf.entidades.Lista_repro;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@Controller
@RequestMapping(value = "/lista", produces = "application/json", method = { RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.HEAD, RequestMethod.POST })
public class AnadirListaController {

	@Autowired
	private RepositorioLista listaRep;


	@Autowired
	
	@GetMapping("/mostrar")
	public List<ListaDto> getAllCancion(){
		return listaRep.findByNombreLista();
	}
	

	@GetMapping("/newList")
	public String displayListForm(Model model) {
		Lista_repro lista = new Lista_repro();
		model.addAttribute("lista", lista);
		return "nuevaLista";
	}

	@PostMapping("/save")
	public String createList(Lista_repro lista, Model model) {
		listaRep.save(lista);
		return "redirect:http://127.0.0.1:5500/index.html";
		
		
		

	}

}