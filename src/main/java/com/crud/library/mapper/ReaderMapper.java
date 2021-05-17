package com.crud.library.mapper;

import com.crud.library.domain.Reader;
import com.crud.library.dto.ReaderDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReaderMapper {
    public Reader mapToReader(final ReaderDto readerDto) {
        Reader reader = new Reader();
        readerDto.getReaderId();
        readerDto.getFirstName();
        readerDto.getLastName();
        readerDto.getAccountCreatingDate();
        return reader;
    }

    public ReaderDto mapToReaderDTO(final Reader reader) {
        return new ReaderDto(reader.getReaderId(),
                reader.getFirstName(),
                reader.getLastName(),
                reader.getAccountCreatingDate());
    }

    public List<ReaderDto> mapToReaderDtoList(final List<Reader> readerList) {
        return readerList.stream().map(this::mapToReaderDTO).collect(Collectors.toList());
    }
}
