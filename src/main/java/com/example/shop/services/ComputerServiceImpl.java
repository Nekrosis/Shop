package com.example.shop.services;

import com.example.shop.models.Computer;
import com.example.shop.repositories.ComputerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ComputerServiceImpl implements ComputerService {
    private final ComputerRepository repository;

    @Transactional
    @Override
    public List<Computer> allDesktop() {
        return repository.findAll();
    }

    @Transactional
    @Override
    public Computer saveDesktop(Computer computer) {
        return repository.save(computer);
    }

    @Transactional
    @Override
    public void deleteDesktop(Long id) {
        repository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Computer> findByFormFactor(String formFactor) {
        return repository.findByFormFactor(formFactor);
    }

    @Transactional
    @Override
    public Optional<Computer> findById(Long id) {
        return repository.findById(id);
    }

}
