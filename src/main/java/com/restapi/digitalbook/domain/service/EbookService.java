package com.restapi.digitalbook.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.digitalbook.domain.dto.ListEbookResponseDTO;
import com.restapi.digitalbook.domain.dto.SingleEbookResponseDTO;
import com.restapi.digitalbook.domain.entity.Ebook;
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
	
	public SingleEbookResponseDTO getEbook(Long ebookId) {
		Optional<Ebook> ebook = ebookRepository.findById(ebookId);

		return new SingleEbookResponseDTO(ebook.get().getId(), ebook.get().getTitle(), 
				ebook.get().getUrlImg(), ebook.get().getDescription(), ebook.get().getAsin(), 
				ebook.get().getPrice(), ebook.get().getAuthors(), ebook.get().getPublisher());

	}
}
