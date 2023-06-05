package com.example.shop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hdd")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HDD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hdd")
    private Long id;
    @Column(name = "series_number")
    @Size(min =2 )
    @NotBlank
    private String seriesNumber;
    @Size(min =2 )
    @NotBlank
    @Column(name = "manufacturer")
    private String manufacturer;
    @NotNull
    @Column(name = "price")
    private Long price;
    @Column(name = "count")
    private Long count;
    @NotNull
    @Column(name = "volume")
    private int volume;
}
