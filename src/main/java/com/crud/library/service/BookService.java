package com.crud.library.service;

import com.crud.library.domain.Book;
import com.crud.library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {


    private final BookRepository bookRepository;


    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(final Long id) {
        return bookRepository.findById(id).get();
    }


    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> findBooksByTitle(String title) {
        return bookRepository.findAll().stream()
                .filter(book -> title.equals(book.getTitle())).collect(Collectors.toList());
    }
}
