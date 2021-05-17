package com.crud.library.mapper;

import com.crud.library.domain.Book;
import com.crud.library.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookMapper {
    public Book mapToBook(final BookDto bookDto) {
        Book book = new Book();
        bookDto.getBooksId();
        bookDto.getTitle();
        bookDto.getAuthor();
        bookDto.getPublished();
        return book;
    }

    public BookDto mapToBookDto(final Book book) {
        return new BookDto(book.getBooksId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublished());
    }

    public List<BookDto> mapToBookDtoList(final List<Book> bookList) {
        return bookList.stream()
                .map(this::mapToBookDto)
                        /*(book -> new BookDto(book.getBooksId(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getPublished()
                ))*/
                .collect(Collectors.toList());
    }
}
