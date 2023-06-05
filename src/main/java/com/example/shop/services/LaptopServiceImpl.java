package com.example.shop.services;

import com.example.shop.models.Laptop;
import com.example.shop.repositories.LaptopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class LaptopServiceImpl implements LaptopService {
    private final LaptopRepository repository;

    @Override
    public List<Laptop> allLaptop() {
        return repository.findAll();
    }

    @Override
    public Laptop saveLaptop(Laptop laptop) {
        return repository.save(laptop);
    }

    @Override
    public void deleteLaptop(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Laptop> findBySize(int size) {
        return repository.findBySize(size);
    }

    @Override
    public Optional<Laptop> findById(Long id) {
        return repository.findById(id);
    }
}
