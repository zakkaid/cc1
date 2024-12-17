package com.example.cc1.service;

import com.example.cc1.dao.repositories.BookRepository;
import com.example.cc1.dto.BookDTO;
import com.example.cc1.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;



    @Override
    public List<BookDTO> getBookByTitle(String titre) {
        return bookMapper.toDTO(bookRepository.findByTitre(titre));
    }

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        return bookMapper.toDTO(bookRepository.save(bookMapper.fromDtoToBook(bookDTO)));
    }
}