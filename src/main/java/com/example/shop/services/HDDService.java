package com.example.shop.services;

import com.example.shop.models.HDD;

import java.util.List;
import java.util.Optional;

public interface HDDService {
    List<HDD> allHDD();

    HDD saveHDD(HDD hdd);

    void deleteHDD(Long id);

    List<HDD> findByVolume(int volume);

    Optional<HDD> findById(Long id);
}
