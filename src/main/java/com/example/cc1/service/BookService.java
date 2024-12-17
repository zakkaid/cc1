package com.example.cc1.service;

import com.example.cc1.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> getBookByTitle(String titre);
    BookDTO saveBook(BookDTO bookDTO);
}
