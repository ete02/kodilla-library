package com.crud.library.repository;

import com.crud.library.domain.BorrowProcess;
import com.crud.library.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowProcessRepository extends JpaRepository<BorrowProcess, Long> {
    List<BorrowProcess>findBorrowProcessByReader(Reader reader);
}
