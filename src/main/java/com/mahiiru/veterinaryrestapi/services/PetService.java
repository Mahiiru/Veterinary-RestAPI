package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;
}
