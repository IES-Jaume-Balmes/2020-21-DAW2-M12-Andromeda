package com.dev.webthymeleaf.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.webthymeleaf.servicios.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {	
		
		return "login";
	}
	
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
