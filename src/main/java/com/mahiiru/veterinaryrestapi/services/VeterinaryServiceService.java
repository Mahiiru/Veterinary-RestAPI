package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.repositories.VeterinaryServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinaryServiceService {

    @Autowired
    private VeterinaryServiceRepository repository;
}