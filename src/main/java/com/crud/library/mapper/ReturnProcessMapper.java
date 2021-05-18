package com.crud.library.mapper;

import com.crud.library.domain.ReturnProcess;
import com.crud.library.dto.ReturnProcessDto;
import com.crud.library.service.BorrowProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReturnProcessMapper {

    private BorrowProcessService borrowProcessService;

    public ReturnProcess mapToReturnProcess(final ReturnProcessDto returnProcessDto) {
        return new ReturnProcess(returnProcessDto.getReturnId());
    }

    public ReturnProcessDto mapToReturnProcessDto(final ReturnProcess returnProcess) {
        return new ReturnProcessDto(returnProcess.getReturnId());
    }

    public List<ReturnProcessDto> mapToReturnProcessDtoList (final List<ReturnProcess> list) {
        return list.stream()
                .map(returnProcess -> new ReturnProcessDto(returnProcess.getReturnId()))
                .collect(Collectors.toList());
    }
}
