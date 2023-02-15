package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.Pet;
import com.mahiiru.veterinaryrestapi.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    public List<Pet> getAllPets() {
        return repository.findAll();
    }

    public Optional<Pet> getPetById(Long id) {
        return repository.findById(id);
    }
}
