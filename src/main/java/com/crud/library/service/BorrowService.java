package com.crud.library.service;

import com.crud.library.domain.Borrow;
import com.crud.library.dto.BorrowDto;
import com.crud.library.repository.BorrowRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BorrowService {

    private final BorrowRepository borrowRepository;

    public Optional<Borrow> getBorrow(final Long borrowId){
        return borrowRepository.findById(borrowId);
    }

    public Borrow saveBorrow (final Borrow borrow){
        return borrowRepository.save(borrow);
    }

    public void deleteBorrow (final BorrowDto borrowDto){
        borrowRepository.deleteById(borrowDto.getBorrowId());
    }
}
