package com.dev.webthymeleaf.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorMiMusica {
@GetMapping("/mimusica")
public String cargar(Model model) {
	return "/mimusica";
}
}
