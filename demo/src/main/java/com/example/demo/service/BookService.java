package com.example.demo.service;

import com.example.demo.dto.BookDto;
import java.util.List;

public interface BookService {

    List<BookDto> getBookByTitre(String titre);

    BookDto saveBook(BookDto bookDto);


}
