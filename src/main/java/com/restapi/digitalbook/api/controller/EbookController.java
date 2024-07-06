package com.restapi.digitalbook.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.digitalbook.domain.dto.ListEbookResponseDTO;
import com.restapi.digitalbook.domain.service.EbookService;

@RequestMapping("/ebooks")
@RestController
public class EbookController {

	@Autowired
	private EbookService ebookService;
	
	@GetMapping
	public List<ListEbookResponseDTO> listAll() {
		return ebookService.listAll();
	}
}
