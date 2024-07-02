package com.restapi.digitalbook.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.digitalbook.domain.entity.Author;
import com.restapi.digitalbook.domain.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@GetMapping
	public List<Author> listAll() {
		return authorService.listAll();
	}
}
