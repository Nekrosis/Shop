package com.example.shop.services;

import com.example.shop.models.Laptop;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class LaptopIT extends BaseIT{

    @Test
    void testGetAll() {
        List<Laptop> expectedList = new ArrayList<>();
        Laptop firstLaptop = new Laptop();
        Laptop secondLaptop = new Laptop();
        expectedList.add(firstLaptop);
        expectedList.add(secondLaptop);
        when(laptopRepository.findAll()).thenReturn(expectedList);
        List<Laptop> actualList = laptopService.allLaptop();
        assertThat(actualList).isEqualTo(expectedList);
        verify(laptopRepository, times(1)).findAll();
    }

    @Test
    void testSave() {
        when(laptopRepository.save(laptop)).thenReturn(laptop);
        laptopService.saveLaptop(laptop);
        verify(laptopRepository, times(1)).save(laptop);
    }

    @Test
    void testFindById() {
        Laptop laptop1 = null;
        when(laptopRepository.findById(hdd.getId())).thenReturn(Optional.ofNullable(laptop));
        Optional<Laptop> expectDesktop = laptopService.findById(laptop.getId());
        if (expectDesktop.isPresent()) {
            laptop1 = expectDesktop.get();
        }
        assertThat(laptop).isEqualTo(laptop1);
        verify(laptopRepository, times(1)).findById(laptop.getId());
    }

    @Test
    void testFindBySize() {
        List<Laptop> expectedList = new ArrayList<>();
        Laptop firstLaptop = new Laptop();
        firstLaptop.setSize(laptop.getSize());
        expectedList.add(firstLaptop);
        when(laptopRepository.findBySize(laptop.getSize())).thenReturn(expectedList);
        List<Laptop> actualList = laptopService.findBySize(laptop.getSize());
        assertThat(actualList).isEqualTo(expectedList);
        verify(laptopRepository, times(1)).findBySize(laptop.getSize());
    }

    @Test
    void testDeleteById() {
        when(laptopRepository.getReferenceById(ID)).thenReturn(laptop);
        laptopService.deleteLaptop(ID);
        verify(laptopRepository, times(1)).deleteById(ID);
    }
}
