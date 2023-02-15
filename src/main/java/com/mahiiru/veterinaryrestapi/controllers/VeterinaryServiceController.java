package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.VeterinaryService;
import com.mahiiru.veterinaryrestapi.services.VeterinaryServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/veterinaryServices")
public class VeterinaryServiceController {

    @Autowired
    private VeterinaryServiceService service;

    @GetMapping
    public ResponseEntity<List<VeterinaryService>> getAllVeterinaryServices(){
        return ResponseEntity.ok(service.getAllVeterinaryServices());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<VeterinaryService>> getVeterinaryServiceById(@PathVariable Long id){
        return  ResponseEntity.ok(service.getVeterinaryServiceById(id));
    }
}
