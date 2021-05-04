package com.crud.library.repository;

import com.crud.library.domain.Copy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CopyRepository extends JpaRepository<Copy,Long> {
    List<Copy> findByStatus(String status);
}
