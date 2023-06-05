package com.example.shop.controllers;

import com.example.shop.models.Laptop;
import com.example.shop.services.LaptopServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/laptop")
public class LaptopController {
    private final LaptopServiceImpl service;

    @GetMapping("/all")
    public List<Laptop> all() {
        return service.allLaptop();
    }

    @PostMapping("/")
    public Laptop save(@RequestBody Laptop laptop) {
        return service.saveLaptop(laptop);
    }

    @GetMapping("/filter/{size}")
    public List<Laptop> getLaptopBySize(@PathVariable(name = "size") int size) {
        return service.findBySize(size);
    }

    @GetMapping("/{id}")
    public Optional<Laptop> getLaptopById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/")
    public Laptop update(@RequestBody Laptop laptop) {
        return service.saveLaptop(laptop);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.deleteLaptop(id);
    }
}
