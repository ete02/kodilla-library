package com.crud.library.service;

import com.crud.library.domain.BorrowProcess;
import com.crud.library.domain.Reader;
import com.crud.library.dto.BorrowProcessDto;
import com.crud.library.repository.BorrowProcessRepository;
import com.crud.library.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BorrowProcessService {

    private final BorrowProcessRepository borrowProcessRepository;
    private final ReaderRepository readerRepository;

    public Optional <BorrowProcess> getBorrowProcess(final Long borrowProcessId){
        return borrowProcessRepository.findById(borrowProcessId);
    }

    public BorrowProcess saveBorrowProcess (final BorrowProcess borrowProcess ){
        return borrowProcessRepository.save(borrowProcess);
    }

    public void deleteBorrowProcess(final BorrowProcessDto borrowProcessDto){
        borrowProcessRepository.deleteById(borrowProcessDto.getBorrowProcessId());
    }

    public Reader saveReader (final Reader reader){
        return readerRepository.save(reader);
    }
}
