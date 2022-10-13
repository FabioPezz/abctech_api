package br.com.cicdteste.data.controller;

import java.util.Locale;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

@RestController
public class DataController {

	@GetMapping("/")
	public String version() {
		return "Version 1.0.0";
	}
	
}
