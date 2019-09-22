package com.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate() {
		
		restTemplate = new RestTemplate();
		return restTemplate;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
