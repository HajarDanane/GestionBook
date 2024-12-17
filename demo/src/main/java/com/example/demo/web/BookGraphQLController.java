package com.example.demo.web;

import com.example.demo.dto.BookDto;
import com.example.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class BookGraphQLController {

    @Autowired
    private  BookService bookService;


    @QueryMapping
    public List<BookDto> getBookByTitre(@Argument String titre) {
        return bookService.getBookByTitre(titre);
    }

    @MutationMapping
    public BookDto saveBook(@Argument BookDto bookDto) {

        return bookService.saveBook(bookDto);
    }

}
