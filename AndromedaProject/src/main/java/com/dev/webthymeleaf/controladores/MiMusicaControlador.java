package com.dev.webthymeleaf.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiMusicaControlador {

	@GetMapping("/mimusica")
	public String AccederMiMusica(Model model) {
		
		return "/mimusica.html";
	}
	
}
