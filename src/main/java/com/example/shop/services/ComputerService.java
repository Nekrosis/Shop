package com.example.shop.services;

import com.example.shop.models.Computer;

import java.util.List;
import java.util.Optional;

public interface ComputerService {
    List<Computer> allDesktop();

    Computer saveDesktop(Computer computer);

    void deleteDesktop(Long id);

    List<Computer> findByFormFactor(String formFactor);

    Optional<Computer> findById(Long id);
}
