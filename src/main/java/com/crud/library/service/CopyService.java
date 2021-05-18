package com.crud.library.service;

import com.crud.library.domain.Borrow;
import com.crud.library.domain.Copy;
import com.crud.library.dto.CopyDto;
import com.crud.library.repository.CopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CopyService {

   private final CopyRepository copyRepository;

    public List<Copy> getAllCopies() {
        return copyRepository.findAll();
    }

    public Optional<Copy> getCopiesById (final Long copiesId){
        return copyRepository.findById(copiesId);
    }

    public Copy saveCopy(final Copy copy) {
        return copyRepository.save(copy);
    }

    public void  deleteCopy (final CopyDto copyDto){
        copyRepository.deleteById(copyDto.getCopiesId());
    }
}
