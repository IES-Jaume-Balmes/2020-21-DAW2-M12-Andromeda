package com.dev.webthymeleaf.controladores;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.webthymeleaf.entidades.Usuario;

@Controller
public class ControladorRegistro {
	
	@GetMapping("/registro")
	public String registrarNuevoUsuario(Model model) {
		Usuario nuevo = new Usuario();
		//model.addAttribute("registroUsuario", nuevo);
		
		return "/register.html";
		
	}
		
		
	
	
	
	

}
