package com.example.shop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "laptop")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_laptop")
    private Long id;
    @Size(min = 2)
    @NotBlank
    @Column(name = "series_number")
    private String seriesNumber;
    @Size(min = 2)
    @NotBlank
    @Column(name = "manufacturer")
    private String manufacturer;
    @NotNull
    @Column(name = "price")
    private Long price;
    @Column(name = "count")
    private Long count;
    @NotNull
    @Min(value = 10)
    @Max(value = 20)
    @Column(name = "size")
    private int size;
}
