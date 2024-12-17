package com.example.demo.service;

import com.example.demo.dao.entities.Book;
import com.example.demo.dao.repositories.BookRepository;
import com.example.demo.dto.BookDto;
import com.example.demo.mapper.BookMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDto> getBookByTitre(String titre) {
        return bookRepository.findByTitre(titre)
                .stream()
                .map(bookMapper::fromBookToBookDto)
                .collect(Collectors.toList());

    }

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        return bookMapper.fromBookToBookDto(bookRepository.save(book));
    }
}
