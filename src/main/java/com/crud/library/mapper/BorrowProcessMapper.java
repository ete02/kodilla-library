package com.crud.library.mapper;

import com.crud.library.domain.BorrowProcess;
import com.crud.library.dto.BorrowProcessDto;
import com.crud.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowProcessMapper {

    private ReaderService readerService;

    public BorrowProcess mapToBorrow(final BorrowProcessDto borrowProcessDto) {
        BorrowProcess borrowProcess = new BorrowProcess();
        borrowProcessDto.getBorrowProcessId();
        borrowProcessDto.getReader();
        borrowProcess.getBookTitle();
        borrowProcess.getReturnDate();

        return borrowProcess;
    }

    public BorrowProcessDto mapToBorrowPrecessDto(final BorrowProcess borrowProcess) {
        return new BorrowProcessDto(
                borrowProcess.getBorrowProcessId(),
                borrowProcess.getReader(),
                borrowProcess.getBookTitle(),
                borrowProcess.getReturnDate());
    }

    public List<BorrowProcessDto> mapToBorrowProcessDtoList(final List<BorrowProcess> list) {
        return list.stream()
                .map(this::mapToBorrowPrecessDto)
                .collect(Collectors.toList());
    }
}
