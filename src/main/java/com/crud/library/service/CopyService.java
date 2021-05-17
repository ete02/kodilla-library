package com.crud.library.service;

import com.crud.library.domain.Copy;
import com.crud.library.repository.CopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopyService {
    @Autowired
    CopyRepository copyRepository;

    @Autowired
    BookService bookService;

    public List<Copy> getCopies() {
        return copyRepository.findAll();
    }

    public Copy saveCopy (Copy copy) {
        copy.setBook(bookService.getBookById(copy.getCopiesId());
        return copyRepository.save(copy);
    }


    public Copy updateCopyStatus(Long copyId, String newStatus) {
        Copy copyById = getCopiesById(copyId);
        copyById.setStatus(newStatus);
        saveCopy(copyById);
        return copyById;
    }

    public Copy getCopiesById(final Long id) {
        return copyRepository.findById(getCopiesById(id);
    }

    public void deleteItemById(final Long id) {
        copyRepository.deleteById(id);
    }
}
