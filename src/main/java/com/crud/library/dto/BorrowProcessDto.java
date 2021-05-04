package com.crud.library.dto;

import com.crud.library.domain.Reader;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class BorrowProcessDto {
    public Long borrowProcessId;
    public Reader reader;
    public String bookTitle;
    public Date borrowProcessDate;
}
