package com.crud.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {
    private Long booksId;
    private String title;
    private String author;
    private String published;
}
