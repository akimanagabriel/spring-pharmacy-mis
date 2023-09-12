package com.pharmacy.dev.controller;

import com.pharmacy.dev.entity.Medication;
import com.pharmacy.dev.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medication")
public class MedicationController {
    @Autowired
    private MedicationService service;

    @GetMapping
    public List<Medication> index() {
        return service.getAll();
    }
}
