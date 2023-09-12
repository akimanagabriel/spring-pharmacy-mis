package com.pharmacy.dev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
    @Id
    @GeneratedValue
    private long id;
    private float amount;
    private String paymentMethod;

    @OneToOne()
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
