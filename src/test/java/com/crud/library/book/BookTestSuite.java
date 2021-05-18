package com.crud.library.book;

import com.crud.library.dao.BookDao;
import com.crud.library.domain.Book;
import com.crud.library.dto.BookDto;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookTestSuite {

    @Autowired
    BookDao bookDao;

    @Test
    public void testBookDaoSave() {

        Book book = new Book();
        book.setTitle("Book1");
        book.setAuthor("Author1");
        book.setPublished("1930");
        bookDao.save(book);

        Book book2 = new Book();
        book2.setTitle("Book2");
        book2.setAuthor("Author2");
        book2.setPublished("1950");
        bookDao.save(book2);

        Long id = book.getBooksId();
        Optional<Book> foundedBook = bookDao.findById(id);
        Assert.assertTrue(foundedBook.isPresent());
        Assert.assertEquals(2, bookDao.findByTitle("Book1").size());

    }
}
