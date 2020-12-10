package com.purplewisteria.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

/*
Load Balancing:
To enable load balancing using Ribbon when calling a feign service add the following code in one of the configuration class.
*/	    @Bean
		@LoadBalanced
	    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();
	    }
}
