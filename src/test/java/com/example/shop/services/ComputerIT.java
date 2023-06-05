package com.example.shop.services;

import com.example.shop.models.Computer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class ComputerIT extends BaseIT {

    @Test
    void testGetAll() {
        List<Computer> expectedList = new ArrayList<>();
        Computer firstDesktop = new Computer();
        Computer secondDesktop = new Computer();
        expectedList.add(firstDesktop);
        expectedList.add(secondDesktop);
        when(computerRepository.findAll()).thenReturn(expectedList);
        List<Computer> actualList = computerService.allDesktop();
        assertThat(actualList).isEqualTo(expectedList);
        verify(computerRepository, times(1)).findAll();
    }

    @Test
    void testSave() {
        when(computerRepository.save(computer)).thenReturn(computer);
        computerService.saveDesktop(computer);
        verify(computerRepository, times(1)).save(computer);
    }

    @Test
    void testFindById() {
        Computer computer1 = null;
        when(computerRepository.findById(computer.getId())).thenReturn(Optional.ofNullable(computer));
        Optional<Computer> expectDesktop = computerService.findById(computer.getId());
        if (expectDesktop.isPresent()) {
            computer1 = expectDesktop.get();
        }
        assertThat(computer).isEqualTo(computer1);
        verify(computerRepository, times(1)).findById(computer.getId());
    }

    @Test
    void testFindByFormFactor() {
        List<Computer> expectedList = new ArrayList<>();
        Computer firstDesktop = new Computer();
        firstDesktop.setFormFactor(computer.getFormFactor());
        expectedList.add(firstDesktop);
        System.out.println(computerService.findByFormFactor(computer.getFormFactor()));
        when(computerRepository.findByFormFactor(computer.getFormFactor())).thenReturn(expectedList);
        List<Computer> actualList = computerService.findByFormFactor(computer.getFormFactor());
        assertThat(actualList).isEqualTo(expectedList);
        verify(computerRepository, times(2)).findByFormFactor(computer.getFormFactor());
    }


    @Test
    void testDeleteById() {
        when(computerRepository.getReferenceById(ID)).thenReturn(computer);
        computerService.deleteDesktop(ID);
        verify(computerRepository, times(1)).deleteById(ID);
    }
}
