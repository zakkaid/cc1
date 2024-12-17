package com.example.cc1.mapper;

import com.example.cc1.dao.entities.Book;
import com.example.cc1.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Book fromDtoToBook(BookDTO bookDTO) {
        return mapper.map(bookDTO, Book.class);
    }

    public BookDTO toDTO(Book book) {
        return mapper.map(book, BookDTO.class);
    }

    public List<BookDTO> toDTO(List<Book> b) {
        return b.stream().map(this::toDTO).toList();
    }
}
