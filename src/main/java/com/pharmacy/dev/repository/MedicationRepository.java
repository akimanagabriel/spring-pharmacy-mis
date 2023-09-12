package com.pharmacy.dev.repository;

import com.pharmacy.dev.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
