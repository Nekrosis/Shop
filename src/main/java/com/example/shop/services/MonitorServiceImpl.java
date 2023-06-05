package com.example.shop.services;

import com.example.shop.models.Monitor;
import com.example.shop.repositories.MonitorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MonitorServiceImpl implements MonitorService {
    private final MonitorRepository repository;

    @Override
    public List<Monitor> allMonitor() {
        return repository.findAll();
    }

    @Override
    public Monitor saveMonitor(Monitor monitor) {
        return repository.save(monitor);
    }

    @Override
    public void deleteMonitor(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Monitor> findByDiagonal(int diagonal) {
        return repository.findByDiagonal(diagonal);
    }

    @Override
    public Optional<Monitor> findById(Long id) {
        return repository.findById(id);
    }
}
