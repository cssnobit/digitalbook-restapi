package com.restapi.digitalbook.domain.dto;

import java.math.BigDecimal;
import java.util.List;

import com.restapi.digitalbook.domain.entity.Author;
import com.restapi.digitalbook.domain.entity.Publisher;

public record SingleEbookResponseDTO(Long id, String title, String urlImg, String description, 
		String asin, BigDecimal price, List<Author> authors, Publisher publisher) {
}
