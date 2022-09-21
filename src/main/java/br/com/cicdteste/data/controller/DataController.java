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
	
	@GetMapping("/books")
	public JsonNode getBooks() {
		
		var objectMapper = new ObjectMapper();
		var faker = new Faker(new Locale("pt-BR"));
		var books = objectMapper.createArrayNode();
		for (var i = 0; i < 10; i++) {
			var book = faker.book();
				books.add(objectMapper.createObjectNode()
						.put("title", book.title())
						.put("author", book.author())
						.put("genre", book.genre())
						.put("publisher", book.publisher()));
		}
		return books;
	}
}
