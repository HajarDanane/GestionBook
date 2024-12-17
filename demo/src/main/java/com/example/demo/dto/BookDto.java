package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {

    private String titre;
    private String publisher;
    private String datePublication;
    private Double price;
    private String resume;


}
