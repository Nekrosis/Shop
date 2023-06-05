package com.example.shop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "desktop")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_desktop")
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
    @NotBlank
    @Column(name = "form_factor")
    private String formFactor;
}
