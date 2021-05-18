package com.crud.library.mapper;

import com.crud.library.domain.Borrow;
import com.crud.library.dto.BorrowDto;
import com.crud.library.service.CopyService;
import com.crud.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowMapper {

    private ReaderService readerService;

    private CopyService copyService;

    public Borrow mapToBorrow(final BorrowDto borrowDto) {
        Borrow borrow = new Borrow();
        borrowDto.getBorrowId();
        borrowDto.getDate();
        borrowDto.getReader();
        borrowDto.getCopy();
        return borrow;
    }

    public BorrowDto mapToBorrowDto(final Borrow borrow) {
        return new BorrowDto(
                borrow.getBorrowId(),
                borrow.getBorrowDate(),
                borrow.getReader(),
                borrow.getCopy());
    }

    public List<BorrowDto> mapToBorrowDtoList(List<Borrow> borrowList) {
        return borrowList.stream()
                .map(this::mapToBorrowDto)
                .collect(Collectors.toList());
    }
}
