package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.Rol;
import com.mahiiru.veterinaryrestapi.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    @Autowired
    private RolRepository repository;


    public List<Rol> getAllRoles() {
        return repository.findAll();
    }


    public Optional<Rol> getRolById(Long id) {
        return repository.findById(id);
    }
}
