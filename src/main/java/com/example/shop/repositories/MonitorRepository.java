package com.example.shop.repositories;

import com.example.shop.models.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
    @Query(value = "select * from monitor where  monitor.diagonal=?", nativeQuery = true)
    List<Monitor> findByDiagonal(int diagonal);
}
