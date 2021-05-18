package com.crud.library.service;

import com.crud.library.domain.ReturnProcess;
import com.crud.library.repository.ReturnProcessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReturnProcessService {

    private ReturnProcessRepository repository;

    public List<ReturnProcess> getReturnProcesses() {
        return repository.findAll();
    }

    public ReturnProcess save(ReturnProcess returnProcess) {
        return repository.save(returnProcess);
    }

    public ReturnProcess getReturnPrecessById(final Long id) {
        return repository.findById(id).get();
    }


    public void deleteReturnProcessById(final Long id) {
        repository.deleteById(id);
    }
}
