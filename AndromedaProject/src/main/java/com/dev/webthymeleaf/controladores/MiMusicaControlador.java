package com.dev.webthymeleaf.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.webthymeleaf.dao.RepositorioCancion;
import com.dev.webthymeleaf.entidades.Cancion;


@Controller
public class MiMusicaControlador {
	@Autowired
	RepositorioCancion CancRep;
	
	@GetMapping("/mimusica")
	public String accederUrl(Model model) {
		List<Cancion>listCanc=CancRep.findAll();
		model.addAttribute("cancion", listCanc);
//		Cancion cancion = new Cancion();
//		model.addAttribute("cancion", cancion);
		return "vercancion";
	}
	
}
