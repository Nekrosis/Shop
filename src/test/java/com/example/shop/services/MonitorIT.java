package com.example.shop.services;

import com.example.shop.models.Monitor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class MonitorIT extends BaseIT{

    @Test
    void testGetAll() {
        List<Monitor> expectedList = new ArrayList<>();
        Monitor firstMonitor = new Monitor();
        Monitor secondMonitor = new Monitor();
        expectedList.add(firstMonitor);
        expectedList.add(secondMonitor);
        when(monitorRepository.findAll()).thenReturn(expectedList);
        List<Monitor> actualList = monitorService.allMonitor();
        assertThat(actualList).isEqualTo(expectedList);
        verify(monitorRepository, times(1)).findAll();
    }

    @Test
    void testSave() {
        when(monitorRepository.save(monitor)).thenReturn(monitor);
        monitorService.saveMonitor(monitor);
        verify(monitorRepository, times(1)).save(monitor);
    }

    @Test
    void testFindById() {
        Monitor monitor1 = null;
        when(monitorRepository.findById(hdd.getId())).thenReturn(Optional.ofNullable(monitor));
        Optional<Monitor> expectDesktop = monitorService.findById(monitor.getId());
        if (expectDesktop.isPresent()) {
            monitor1 = expectDesktop.get();
        }
        assertThat(monitor).isEqualTo(monitor1);
        verify(monitorRepository, times(1)).findById(monitor.getId());
    }

    @Test
    void testFindByDiagonal() {
        List<Monitor> expectedList = new ArrayList<>();
        Monitor firstMonitor = new Monitor();
        firstMonitor.setDiagonal(monitor.getDiagonal());
        expectedList.add(firstMonitor);
        when(monitorRepository.findByDiagonal(monitor.getDiagonal())).thenReturn(expectedList);
        List<Monitor> actualList = monitorService.findByDiagonal(monitor.getDiagonal());
        assertThat(actualList).isEqualTo(expectedList);
        verify(monitorRepository, times(1)).findByDiagonal(monitor.getDiagonal());
    }

    @Test
    void testDeleteById() {
        when(monitorRepository.getReferenceById(ID)).thenReturn(monitor);
        monitorService.deleteMonitor(ID);
        verify(monitorRepository, times(1)).deleteById(ID);
    }
}
