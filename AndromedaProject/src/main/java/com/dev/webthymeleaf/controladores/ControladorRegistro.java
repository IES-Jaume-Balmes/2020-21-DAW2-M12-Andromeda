package com.dev.webthymeleaf.controladores;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.webthymeleaf.dao.RepositorioUsuario;
import com.dev.webthymeleaf.entidades.Usuario;



@Controller
public class ControladorRegistro {
	
	@Autowired
	RepositorioUsuario UsuarioRep;
	
	@GetMapping("/registro")
	public String registrarNuevoUsuario(Model model) {
		Usuario nuevo = new Usuario();
		model.addAttribute("registroUsuario", nuevo);
		
		return "/register.html";
		
	}
		
	@PostMapping("/guardar")
	public String guardado(Usuario nuevo,Model model) {
		
		UsuarioRep.save(nuevo);
		
		return "redirect:/";
	}
	
	
	
	

}
