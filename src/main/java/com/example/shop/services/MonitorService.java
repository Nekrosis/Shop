package com.example.shop.services;

import com.example.shop.models.Laptop;
import com.example.shop.models.Monitor;

import java.util.List;
import java.util.Optional;

public interface MonitorService {
    List<Monitor> allMonitor();

    Monitor saveMonitor(Monitor monitor);

    void deleteMonitor(Long id);

    List<Monitor> findByDiagonal(int diagonal);

    Optional<Monitor> findById(Long id);
}
