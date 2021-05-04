package com.crud.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ReaderDto {
    public Long readerId;
    public String firstName;
    public String lastName;
    public Date accountCreatingDate;

}
