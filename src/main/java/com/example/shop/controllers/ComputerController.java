package com.example.shop.controllers;

import com.example.shop.models.Computer;
import com.example.shop.services.ComputerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/computer")
public class ComputerController {
    private final ComputerServiceImpl service;

    @GetMapping("/all")
    public List<Computer> all() {
        return service.allDesktop();
    }

    @PostMapping("/")
    public Computer save(@RequestBody Computer computer) {
        return service.saveDesktop(computer);
    }

    @GetMapping("/filter/{form_factor}")
    public List<Computer> getDesktopComputerByFormFactor(@PathVariable(name = "form_factor") String formFactor) {
        return service.findByFormFactor(formFactor);
    }

    @GetMapping("/{id}")
    public Optional<Computer> getDesktopComputerById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/")
    public Computer update(@RequestBody Computer computer) {
        return service.saveDesktop(computer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.deleteDesktop(id);
    }
}
