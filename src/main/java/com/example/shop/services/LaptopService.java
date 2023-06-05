package com.example.shop.services;

import com.example.shop.models.Laptop;

import java.util.List;
import java.util.Optional;

public interface LaptopService {

    List<Laptop> allLaptop();

    Laptop saveLaptop(Laptop laptop);

    void deleteLaptop(Long id);

    List<Laptop> findBySize(int size);

    Optional<Laptop> findById(Long id);
}
