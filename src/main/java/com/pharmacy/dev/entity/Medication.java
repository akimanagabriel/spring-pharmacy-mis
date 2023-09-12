package com.pharmacy.dev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Medication")
@Table(name = "medications")
public class Medication {
    @Id
    @GeneratedValue
    private long id;

    @Column(columnDefinition = "INT") // Specify the JDBC data type for int
    private int price;

    @Column(columnDefinition = "VARCHAR(255)") // Specify the JDBC data type for String
    private String name;

    private String dosage;

    @Column(columnDefinition = "BOOLEAN") // Specify the JDBC data type for boolean
    private boolean isAvailable;

    @Column(columnDefinition = "DATE") // Specify the JDBC data type for LocalDate
    private LocalDate batchDate;

    @Column(columnDefinition = "DATE") // Specify the JDBC data type for LocalDate
    private LocalDate expirationDate;
}
