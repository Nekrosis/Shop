package com.example.shop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "monitor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Monitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_monitor")
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
    @Min(value = 13)
    @Max(value = 80)
    @Column(name = "diagonal")
    private int diagonal;

}
