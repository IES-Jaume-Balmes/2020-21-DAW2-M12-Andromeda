package com.dev.webthymeleaf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//jdbc para la autentificacion consultas nativas de sql.

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private BCryptPasswordEncoder passEncoder;

	@Autowired
	public void configurerSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.jdbcAuthentication()
		.dataSource (dataSource)
		.passwordEncoder(passEncoder)
		.usersByUsernameQuery("")//añadir consulta
		.authoritiesByUsernameQuery("");//añadir consulta
		
	}
}
