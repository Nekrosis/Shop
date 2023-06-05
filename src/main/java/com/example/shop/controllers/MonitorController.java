package com.example.shop.controllers;

import com.example.shop.models.Monitor;
import com.example.shop.services.MonitorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/monitor")
public class MonitorController {
    private final MonitorServiceImpl service;

    @GetMapping("/all")
    public List<Monitor> all() {
        return service.allMonitor();
    }

    @PostMapping("/")
    public Monitor save(@RequestBody Monitor monitor) {
        return service.saveMonitor(monitor);
    }

    @GetMapping("/filter/{size}")
    public List<Monitor> getMonitorByDiagonal(@PathVariable(name = "size") int diagonal) {
        return service.findByDiagonal(diagonal);
    }

    @GetMapping("/{id}")
    public Optional<Monitor> getMonitorById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/")
    public Monitor update(@RequestBody Monitor monitor) {
        return service.saveMonitor(monitor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.deleteMonitor(id);
    }
}
