package com.restapi.digitalbook.domain.dto;

import java.math.BigDecimal;
import java.util.List;

import com.restapi.digitalbook.domain.entity.Author;

public record ListEbookResponseDTO(Long id, String title, String urlImg, String description, 
		BigDecimal price, List<Author> authors) {
}
