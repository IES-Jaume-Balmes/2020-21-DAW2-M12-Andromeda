package com.dev.webthymeleaf.controladores;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	/*Carga la página principal de la app*/
	@GetMapping("/")
	public String home() {
		return "index";
	}

	/*Carga el formulario de registro*/
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	/*Muestra el usuario que esta autentificado(logeado) en el momento;*/
	@GetMapping(value = "/username")
	@ResponseBody
	public String currentUserName(Authentication authentication) {
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		if (authentication != null)
			return authentication.getName();
		else
			return "";
	}
}
