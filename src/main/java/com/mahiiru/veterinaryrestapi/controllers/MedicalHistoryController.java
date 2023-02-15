package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.MedicalHistory;
import com.mahiiru.veterinaryrestapi.services.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/medicalHistories")
public class MedicalHistoryController {

    @Autowired
    private MedicalHistoryService service;

    @GetMapping
    public ResponseEntity<List<MedicalHistory>> getAllMedicalHistories(){
        return ResponseEntity.ok(service.getAllMedicalHistories());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<MedicalHistory>> getMedicalHistoryById(@PathVariable Long id){
        return ResponseEntity.ok(service.getMedicalHistoryById(id));
    }
}
