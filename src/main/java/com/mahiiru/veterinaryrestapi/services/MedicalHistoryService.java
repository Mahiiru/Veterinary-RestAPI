package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.repositories.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository repository;
}
