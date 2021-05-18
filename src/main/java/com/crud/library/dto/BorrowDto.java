package com.crud.library.dto;

import com.crud.library.domain.Copy;
import com.crud.library.domain.Reader;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class BorrowDto {
    private Long borrowId;
    private LocalDate date;
    private Reader reader;
    private Copy copy;

}
