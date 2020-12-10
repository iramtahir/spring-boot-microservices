package com.purplewisteria.accounts.security;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// Add Spring Security to Users Microservice
// Add WebSecurity Configuration
/*
 If a Spring Boot Security dependency is added on the classpath, Spring Boot application automatically
  requires the Basic Authentication for all HTTP Endpoints. The Endpoint “/” and “/home” does not
require any authentication. All other Endpoints require authentication.
  */
/*
@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter{

	private Environment environment;
	
	
	@Autowired
	public WebSecurity(Environment environment) {
		this.environment = environment;
	}
	
	public void configure( HttpSecurity security) throws Exception {
		
		security.csrf().disable();
	
	// User's Microservice recives Http Requests only from IP address of Zull API Gateway Server.	
	 // And reading "gateway.ip" key/property from application.properties file.
	 
		//security.authorizeRequests().antMatchers("/checking/**").permitAll();
	security.authorizeRequests().antMatchers("/**").hasIpAddress(environment.getProperty("gateway.ip"));  //Allow only IP address of Zuul API Gateway
		 
		// Enabling h2-console to work with Spring Security
		security.headers().frameOptions().disable();
		
	}

	}
	
*/
