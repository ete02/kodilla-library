package com.crud.library.repository;

import com.crud.library.domain.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow,Long> {
    List<Borrow> findBorrowByDate(Date date);
    List<Borrow>findByReaderLastName(String lastName);
    List<Borrow>findByCopyStatus(String status);
}