package com.example.shop.repositories;

import com.example.shop.models.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    @Query(value = "select * from desktop where  desktop.form_factor=?", nativeQuery = true)
    List<Computer> findByFormFactor(String formFactor);
}
