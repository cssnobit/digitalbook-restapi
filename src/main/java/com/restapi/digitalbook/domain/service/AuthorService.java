package com.restapi.digitalbook.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.digitalbook.domain.dto.AuthorResponseDTO;
import com.restapi.digitalbook.domain.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public List<AuthorResponseDTO> listAll() {
		List<AuthorResponseDTO> response = new ArrayList<>();
		authorRepository.findAll()
				.forEach(author -> {
					AuthorResponseDTO authorDTO = new AuthorResponseDTO(author.getId(), 
							author.getName());
					
					response.add(authorDTO);
				});
		
		return response;
	}
	
	
}
