package com.crud.library.service;

import com.crud.library.domain.Reader;
import com.crud.library.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReaderService {

    public final ReaderRepository readerRepository;

    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    public Optional<Reader>getReaders(final Long readerId){
        return readerRepository.findById(readerId);
    }

    public Reader save(Reader reader) {
        return readerRepository.save(reader);
    }

    public Reader getReaderById(final Long id) {
        return readerRepository.findById(id).get();
    }

    public void deleteById(final Long id) {
        readerRepository.deleteById(id);
    }
}
