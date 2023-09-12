package com.pharmacy.dev.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medication {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String dossage;
    private boolean isAvailable;
    private LocalDate batchDate;
    private LocalDate expirationDate;
}
