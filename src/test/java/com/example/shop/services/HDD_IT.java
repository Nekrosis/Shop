package com.example.shop.services;

import com.example.shop.models.HDD;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class HDD_IT extends BaseIT{

    @Test
    void testGetAll() {
        List<HDD> expectedList = new ArrayList<>();
        HDD firstHDD = new HDD();
        HDD secondHDD = new HDD();
        expectedList.add(firstHDD);
        expectedList.add(secondHDD);
        when(hddRepository.findAll()).thenReturn(expectedList);
        List<HDD> actualList = hddService.allHDD();
        assertThat(actualList).isEqualTo(expectedList);
        verify(hddRepository, times(1)).findAll();
    }

    @Test
    void testSave() {
        when(hddRepository.save(hdd)).thenReturn(hdd);
        hddService.saveHDD(hdd);
        verify(hddRepository, times(1)).save(hdd);
    }

    @Test
    void testFindById() {
        HDD hdd1 = null;
        when(hddRepository.findById(hdd.getId())).thenReturn(Optional.ofNullable(hdd));
        Optional<HDD> expectDesktop = hddService.findById(hdd.getId());
        if (expectDesktop.isPresent()) {
            hdd1 = expectDesktop.get();
        }
        assertThat(hdd).isEqualTo(hdd1);
        verify(hddRepository, times(1)).findById(hdd.getId());
    }

    @Test
    void testFindByVolume() {
        List<HDD> expectedList = new ArrayList<>();
        HDD firstHDD = new HDD();
        firstHDD.setVolume(hdd.getVolume());
        expectedList.add(firstHDD);
        when(hddRepository.findByVolume(hdd.getVolume())).thenReturn(expectedList);
        List<HDD> actualList = hddService.findByVolume(hdd.getVolume());
        assertThat(actualList).isEqualTo(expectedList);
        verify(hddRepository, times(1)).findByVolume(hdd.getVolume());
    }

    @Test
    void testDeleteById() {
        when(hddRepository.getReferenceById(ID)).thenReturn(hdd);
        hddService.deleteHDD(ID);
        verify(hddRepository, times(1)).deleteById(ID);
    }
}
