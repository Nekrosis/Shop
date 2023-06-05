package com.example.shop.repositories;

import com.example.shop.models.HDD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HDDRepository extends JpaRepository<HDD, Long> {
    @Query(value = "select * from hdd where  hdd.volume=?", nativeQuery = true)
    List<HDD> findByVolume(int volume);
}
