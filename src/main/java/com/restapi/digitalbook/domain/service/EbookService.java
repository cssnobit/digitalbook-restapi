package com.restapi.digitalbook.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.digitalbook.domain.dto.ListEbookResponseDTO;
import com.restapi.digitalbook.domain.repository.EbookRepository;

@Service
public class EbookService {

	@Autowired
	private EbookRepository ebookRepository;
	
	public List<ListEbookResponseDTO> listAll() {
		List<ListEbookResponseDTO> response = new ArrayList<>();
		ebookRepository.findAll()
			.forEach(ebook -> {
				ListEbookResponseDTO ebookDTO = new ListEbookResponseDTO(ebook.getId(), 
						ebook.getTitle(), ebook.getUrlImg(), ebook.getDescription(), 
						ebook.getPrice(), ebook.getAuthors());
				
				response.add(ebookDTO);
			});
		
		return response;
	}
}
