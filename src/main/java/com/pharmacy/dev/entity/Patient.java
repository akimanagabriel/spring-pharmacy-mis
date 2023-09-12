package com.pharmacy.dev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String address;
    private String phone;
    private String insurance;

    @OneToOne(mappedBy = "patient")
    private Prescription prescription;
}
