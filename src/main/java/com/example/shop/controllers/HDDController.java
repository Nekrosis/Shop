package com.example.shop.controllers;

import com.example.shop.models.HDD;
import com.example.shop.services.HDDServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hdd")
public class HDDController {
    private final HDDServiceImpl service;

    @GetMapping("/all")
    public List<HDD> all() {
        return service.allHDD();
    }

    @PostMapping("/")
    public HDD save(@RequestBody HDD hdd) {
        return service.saveHDD(hdd);
    }

    @GetMapping("/filter/{volume}")
    public List<HDD> getHDDByVolume(@PathVariable(name = "volume") int volume) {
        return service.findByVolume(volume);
    }

    @GetMapping("/{id}")
    public Optional<HDD> getHDDById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/")
    public HDD update(@RequestBody HDD hdd) {
        return service.saveHDD(hdd);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.deleteHDD(id);
    }
}
