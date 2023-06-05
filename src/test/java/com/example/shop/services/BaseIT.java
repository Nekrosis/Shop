package com.example.shop.services;

import com.example.shop.models.Computer;
import com.example.shop.models.HDD;
import com.example.shop.models.Laptop;
import com.example.shop.models.Monitor;
import com.example.shop.repositories.ComputerRepository;
import com.example.shop.repositories.HDDRepository;
import com.example.shop.repositories.LaptopRepository;
import com.example.shop.repositories.MonitorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BaseIT {
    final Long ID = 132L;
    Computer computer;
    HDD hdd;
    Monitor monitor;
    Laptop laptop;


    @Mock
    ComputerRepository computerRepository;
    @Mock
    HDDRepository hddRepository;
    @Mock
    MonitorRepository monitorRepository;
    @Mock
    LaptopRepository laptopRepository;
    @InjectMocks
    ComputerServiceImpl computerService;
    @InjectMocks
    HDDServiceImpl hddService;
    @InjectMocks
    MonitorServiceImpl monitorService;
    @InjectMocks
    LaptopServiceImpl laptopService;

    @BeforeEach
    public void setUp() {
        computer = new Computer();
        computer.setId(ID);
        computer.setCount(32L);
        computer.setFormFactor("monoblock");
        computer.setPrice(32145L);
        computer.setManufacturer("ASUS");
        computer.setSeriesNumber("32S3");

        laptop = new Laptop();
        laptop.setId(ID);
        laptop.setCount(3L);
        laptop.setSize(15);
        laptop.setPrice(56645L);
        laptop.setManufacturer("Macbook");
        laptop.setSeriesNumber("A1458");

        monitor = new Monitor();
        monitor.setId(ID);
        monitor.setCount(10L);
        monitor.setDiagonal(32);
        monitor.setPrice(14360L);
        monitor.setManufacturer("SAMSUNG");
        monitor.setSeriesNumber("s3214");

        hdd = new HDD();
        hdd.setId(ID);
        hdd.setCount(10L);
        hdd.setVolume(512);
        hdd.setPrice(14360L);
        hdd.setManufacturer("Toshiba");
        hdd.setSeriesNumber("6463n23");

    }
}
