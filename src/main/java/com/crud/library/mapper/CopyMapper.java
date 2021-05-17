package com.crud.library.mapper;

import com.crud.library.domain.Book;
import com.crud.library.domain.Copy;
import com.crud.library.dto.CopyDto;
import com.crud.library.repository.CopyRepository;
import com.crud.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CopyMapper {
    @Autowired
    BookService bookService;

    @Autowired
    CopyRepository copyRepository;

    public Copy mapToItem(final CopyDto copyDto) {
        Copy copy = new Copy();
        copyDto.getBook();
        copyDto.getStatus();
        copyDto.getCopiesId();
        return copy;
    }

    public CopyDto mapToCopyDto(final Copy copy) {
        return new CopyDto(
                copy.getCopiesId(),
                copy.getStatus(),
                copy.getBook());

    }


    public List<CopyDto> mapToCopyDtoList(List<Copy> itemList) {
        return itemList.stream()
                .map(this::mapToCopyDto)
                .collect(Collectors.toList());
    }
}
