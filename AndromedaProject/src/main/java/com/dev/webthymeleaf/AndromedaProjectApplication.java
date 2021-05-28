package com.dev.webthymeleaf;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AndromedaProjectApplication{ //implements CommandLineRunner {
/*
@Autowired
	private BCryptPasswordEncoder passEncoder;*/
	
	
	public static void main(String[] args) {
		SpringApplication.run(AndromedaProjectApplication.class, args);
	}
	@Bean //no funciona
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET","PUT","HEAD","POST").allowCredentials(true).allowedOriginPatterns("http://127.0.0.1:5500");
			}
		};
	}
	/*@Override
	public void run(String... args) throws Exception {
		String pass1 = "user";
		String pass2 = "admin";
		
		System.out.println(passEncoder.encode(pass1));
		System.out.println(passEncoder.encode(pass2));
	}*/
}