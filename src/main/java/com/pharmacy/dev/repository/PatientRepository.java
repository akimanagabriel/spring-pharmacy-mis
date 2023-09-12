package com.pharmacy.dev.repository;

import com.pharmacy.dev.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
