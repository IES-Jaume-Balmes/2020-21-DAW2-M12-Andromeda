package com.dev.webthymeleaf.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.webthymeleaf.entidades.Usuario;

@Controller
@RequestMapping("/")
public class loginControlador {

	@GetMapping("/login")
	public String createProject(Model model) {

		return "login/login.html";
	}

}
