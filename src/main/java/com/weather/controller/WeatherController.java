package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/weather")
	public ResponseEntity<String> getWeatherReport(){
		String url = "http://api.openweathermap.org/data/2.5/forecast?id=524901&APPID=46dd6049cbed96faf40623ed949379a0";
		HttpHeaders headers = new HttpHeaders();
		//headers.setContentType(MediaType.APPLICATION_JSON);
		//headers.set("APPID", "46dd6049cbed96faf40623ed949379a0");
		
		HttpEntity<Object> requestEntity = new HttpEntity<>(headers);
		
		ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
		
		result.getBody();
		
		return result;
		
	}

}
