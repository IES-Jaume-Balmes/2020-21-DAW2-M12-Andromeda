package com.dev.webthymeleaf.controladores;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dev.webthymeleaf.dao.RepositorioCancion;
import com.dev.webthymeleaf.dao.RepositorioLista;
import com.dev.webthymeleaf.dto.IdListaCancionDto;
import com.dev.webthymeleaf.entidades.Lista_repro;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@Controller
@RequestMapping(value = "/lista", method = { RequestMethod.GET, RequestMethod.PUT, RequestMethod.HEAD,
		RequestMethod.POST })

public class AnadirListaController {

	@Autowired
	private RepositorioLista listaRep;
	
	@Autowired
	private RepositorioCancion cancionRep;
	
	/*mapeo que recoge los datos del formulario en el que se crea una lista
	 * y se los pasa al modelo*/
	@GetMapping("/newList")
	public String displayListForm(Model model) {
		Lista_repro lista = new Lista_repro();
		model.addAttribute("lista", lista);
		return "nuevaLista";
	}
	
	/*Inserta la lista en la base de datos a través del repositorio de listas*/
	@PostMapping("/save")
	public String createList(Lista_repro lista, Model model) {
		lista.setCanciones(new ArrayList<>());
		listaRep.save(lista);
		return "redirect:http://127.0.0.1:5500/index.html";
	}
	
	/*Inserta utilizando ajax la id_listacon la id_cancion */
	
	/*Creemos que funciona pero está bloqueado por cors*/
	@PostMapping(value = "/request", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity postController(@RequestBody IdListaCancionDto datos) {
		System.out.println("Id cancion: " + datos.getId_cancion() + " Id Lista: " + datos.getId_lista());
		cancionRep.findByIds();
		return ResponseEntity.ok(HttpStatus.OK);
	}
}