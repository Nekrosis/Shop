package com.example.shop.repositories;

import com.example.shop.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    @Query(value = "select * from laptop where  laptop.size=?", nativeQuery = true)
    List<Laptop> findBySize(int size);
}
