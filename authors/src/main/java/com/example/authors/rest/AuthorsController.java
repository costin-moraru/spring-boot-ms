package com.example.authors.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/authors")
public class AuthorsController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String authors() {
		String result = restTemplate.getForObject("http://books/api/books", String.class);
		return String.format("Author: autore Books: %s", result);
	}

}
