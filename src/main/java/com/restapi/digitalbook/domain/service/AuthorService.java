package com.restapi.digitalbook.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.digitalbook.domain.entity.Author;
import com.restapi.digitalbook.domain.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> listAll() {
		return authorRepository.findAll();
	}
}
