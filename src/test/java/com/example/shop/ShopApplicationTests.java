package com.example.shop;

import com.example.shop.controllers.ComputerController;
import com.example.shop.controllers.HDDController;
import com.example.shop.controllers.LaptopController;
import com.example.shop.controllers.MonitorController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShopApplicationTests {
    @Autowired
    ComputerController computerController;
    @Autowired
    HDDController hddController;
    @Autowired
    LaptopController laptopController;
    @Autowired
    MonitorController monitorController;

    @Test
    void contextLoads() {
        assertThat(computerController).isNotNull();
        assertThat(hddController).isNotNull();
        assertThat(laptopController).isNotNull();
        assertThat(monitorController).isNotNull();
    }

}
