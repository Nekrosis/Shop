package com.example.shop.services;

import com.example.shop.models.HDD;
import com.example.shop.repositories.HDDRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class HDDServiceImpl implements HDDService {
    private final HDDRepository repository;

    @Override
    public List<HDD> allHDD() {
        return repository.findAll();
    }

    @Override
    public HDD saveHDD(HDD hdd) {
        return repository.save(hdd);
    }

    @Override
    public void deleteHDD(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<HDD> findByVolume(int volume) {
        return repository.findByVolume(volume);
    }

    @Override
    public Optional<HDD> findById(Long id) {
        return repository.findById(id);
    }
}
