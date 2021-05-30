package com.dev.webthymeleaf.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.webthumeleaf.dto.UserDto;
import com.dev.webthymeleaf.dao.UserRepository;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping(value = "/user", method = { RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.HEAD, RequestMethod.POST })
@RestController
public class UserIdController {

	
	@Autowired
	private UserRepository userRep;
	
	@GetMapping("/mostrar")
	public List<UserDto> getId(){
		return userRep.findByIdAndEmail();
	}
}
