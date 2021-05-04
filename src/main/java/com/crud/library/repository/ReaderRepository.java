package com.crud.library.repository;

import com.crud.library.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
    List<Reader>findByFirstName (String firstName);
    List<Reader>findByAccountCreatingDate(Date date);
}
