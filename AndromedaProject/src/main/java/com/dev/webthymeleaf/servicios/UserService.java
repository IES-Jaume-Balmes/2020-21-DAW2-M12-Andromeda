package com.dev.webthymeleaf.servicios;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.dev.webthymeleaf.dto.UserRegistrationDto;
import com.dev.webthymeleaf.entidades.User;

/*Guarda los usuarios*/
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
