package com.example.cc1.web;

import com.example.cc1.dto.BookDTO;
import com.example.cc1.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphQLController {
    private final BookService bookService;

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO avion) {
        return bookService.saveBook(avion);
    }

    @QueryMapping
    public List<BookDTO> getBookByTitle(@Argument String titre) {
        return bookService.getBookByTitle(titre);
    }

}
