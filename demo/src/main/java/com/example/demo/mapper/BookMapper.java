package com.example.demo.mapper;

import com.example.demo.dao.entities.Book;
import com.example.demo.dto.BookDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Book fromBookDtoToBook(BookDto bookDto){

        return modelMapper.map(bookDto, Book.class);
    }

    public BookDto fromBookToBookDto(Book book){

        return modelMapper.map(book, BookDto.class);
    }

}
