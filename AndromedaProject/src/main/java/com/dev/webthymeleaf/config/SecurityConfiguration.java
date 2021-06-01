package com.dev.webthymeleaf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.dev.webthymeleaf.servicios.UserService;



@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;
	
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
    public DaoAuthenticationProvider authenticationProvider() { //ESTEEEE
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder());
      
        
        return auth;
    }
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
		http
		  .httpBasic().and()
		  .authorizeRequests()
		    .antMatchers(HttpMethod.POST, "/lista").hasRole("USER")
		    .antMatchers(HttpMethod.PUT, "/lista/**").hasRole("USER")
		    .antMatchers(HttpMethod.PATCH, "/lista/**").hasRole("USER");
		http.csrf().disable();
		http.cors().and().authorizeRequests().antMatchers(
				 "/registration**",
	                "/js/**",
	                "/css/**",
	                "/img/**",
	                "/lista/**",
	                "/api/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.permitAll()
		.and()
		.logout()
		.invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login?logout")
		.permitAll();
	}
	
}
