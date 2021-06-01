package com.dev.webthymeleaf.controladores;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.webthymeleaf.dao.RepositorioCancion;
import com.dev.webthymeleaf.dao.RepositorioLista;
import com.dev.webthymeleaf.dto.CancionArtistaDto;
import com.dev.webthymeleaf.dto.IdListaCancionDto;
import com.dev.webthymeleaf.dto.ListaDto;
import com.dev.webthymeleaf.entidades.Lista_repro;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@Controller

@RequestMapping(value = "/lista",  method = { RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.HEAD, RequestMethod.POST })
public class AnadirListaController {

	@Autowired
	private RepositorioLista listaRep;
	@Autowired
	private RepositorioCancion cancionRep;



	@GetMapping("/newList")
	public String displayListForm(Model model) {
		Lista_repro lista = new Lista_repro();
		model.addAttribute("lista", lista);
		return "nuevaLista";
	}

	@PostMapping("/save")
	public String createList(Lista_repro lista, Model model) {
		lista.setCanciones(new ArrayList<>());
		
		//lista.getCanciones().add(cancionRep.findById(2L).get());
		
		listaRep.save(lista);
		return "redirect:http://127.0.0.1:5500/index.html";
	}
	
		//multipart/form-data
		@PostMapping(value="/request",consumes = { MediaType.APPLICATION_JSON_VALUE })
		public ResponseEntity postController(@RequestBody IdListaCancionDto datos) {
			System.out.println("Id cancion: " +datos.getId_cancion()+" Id Lista: "+datos.getId_lista());
		    cancionRep.findByIds();
		    return ResponseEntity.ok(HttpStatus.OK);
		}	
		//resposta que retorna la informació al front
//		@PostMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
//	    @ResponseBody
//	    public IdListaCancionResponse postResponseJsonContent(@RequestBody IdListaCancion datos) {
//	       System.out.println("Id Cancion: " + datos.getId_cancion() + " Id Lista: " + datos.getId_lista());
//	        return new IdListaCancionResponse();
//	    }

	}