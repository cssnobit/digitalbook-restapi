package com.restapi.digitalbook.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.digitalbook.domain.entity.Ebook;

@Repository
public interface EbookRepository extends JpaRepository<Ebook, Long> {

}
