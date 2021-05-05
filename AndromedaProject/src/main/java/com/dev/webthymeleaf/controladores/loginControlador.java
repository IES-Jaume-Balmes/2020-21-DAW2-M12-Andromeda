package com.dev.webthymeleaf.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*
public class loginControlador {

	@Controller
	@RequestMapping("projects")
	public class ProjectController {

		// formulari del projecte
		@GetMapping("/new")
		public String displayProjectForm(Model model) {
			Projecte unProjecte = new Projecte();

			model.addAttribute("project", unProjecte);

			// return"projectes/startTemplate";
			return "projectes/newProject";

		}

		@PostMapping("/save")
		public String createProject(Projecte unProjecte) {
			// guardar a la BD.
			System.out.println(unProjecte);

			return "projectes/startTemplate";
		}

	}

}*/
