package com.crud.library.dto;

import com.crud.library.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CopyDto {
    public Long copiesId;
    public String status;
    public Book book;
}
