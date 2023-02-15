package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.MedicalHistory;
import com.mahiiru.veterinaryrestapi.repositories.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository repository;

    public List<MedicalHistory> getAllMedicalHistories() {
        return repository.findAll();
    }

    public Optional<MedicalHistory> getMedicalHistoryById(Long id) {
        return repository.findById(id);
    }
}
