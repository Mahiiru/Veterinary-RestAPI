package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.Pet;
import com.mahiiru.veterinaryrestapi.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pets")
public class PetController {

    @Autowired
    private PetService service;

    @GetMapping
    public ResponseEntity<List<Pet>> getAllPets(){
        return ResponseEntity.ok(service.getAllPets());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<Pet>> getPetById(@PathVariable Long id){
        return ResponseEntity.ok(service.getPetById(id));
    }
}
