package com.pharmacy.dev.repository;

import com.pharmacy.dev.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
