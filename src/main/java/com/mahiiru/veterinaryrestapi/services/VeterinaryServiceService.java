package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.VeterinaryService;
import com.mahiiru.veterinaryrestapi.repositories.VeterinaryServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinaryServiceService {

    @Autowired
    private VeterinaryServiceRepository repository;

    public List<VeterinaryService> getAllVeterinaryServices() {
        return repository.findAll();
    }

    public Optional<VeterinaryService> getVeterinaryServiceById(Long id) {
        return repository.findById(id);
    }
}
