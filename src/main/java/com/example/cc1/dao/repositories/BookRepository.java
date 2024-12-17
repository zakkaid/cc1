package com.example.cc1.dao.repositories;

import com.example.cc1.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitre(String titre);
}
