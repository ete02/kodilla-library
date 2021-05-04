package com.crud.library.repository;

import com.crud.library.domain.ReturnProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnProcessRepository extends JpaRepository<ReturnProcess, Long> {
}
