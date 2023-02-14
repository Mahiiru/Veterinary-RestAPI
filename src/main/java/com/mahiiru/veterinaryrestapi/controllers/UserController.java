package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.User;
import com.mahiiru.veterinaryrestapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(service.getUserById(id));
    }
}
