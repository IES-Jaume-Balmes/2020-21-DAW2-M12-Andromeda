package com.dev.webthymeleaf.controladores;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dev.webthymeleaf.dto.UserRegistrationDto;
import com.dev.webthymeleaf.servicios.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	/*Muestra el formulario de registro*/
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	/*Verifica el usuario*/
	@GetMapping(value = "/username")
	@ResponseBody
	public Object currentUserName(Authentication authentication) {

		if (authentication != null) {
			System.out.println(authentication.getName());

			return authentication.getDetails();
		} else
			return "";
	}

	/*Guarda el usuario*/
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}
