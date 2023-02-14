package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.Rol;
import com.mahiiru.veterinaryrestapi.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/roles")
public class RolController {

    @Autowired
    private RolService service;

    @GetMapping
    public ResponseEntity<List<Rol>> getAllRoles(){
        return ResponseEntity.ok(service.getAllRoles());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<Rol>> getRolById(@PathVariable Long id){
        return ResponseEntity.ok(service.getRolById(id));
    }
}
