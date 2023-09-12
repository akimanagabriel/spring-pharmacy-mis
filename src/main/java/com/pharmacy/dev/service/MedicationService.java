package com.pharmacy.dev.service;

import com.pharmacy.dev.entity.Medication;
import com.pharmacy.dev.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {
    @Autowired
    private MedicationRepository repository;


// get all medications
    public List<Medication> getAll(){
        return repository.findAll();
    }

}
