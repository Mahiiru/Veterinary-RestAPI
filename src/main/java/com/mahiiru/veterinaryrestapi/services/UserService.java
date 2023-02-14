package com.mahiiru.veterinaryrestapi.services;

import com.mahiiru.veterinaryrestapi.models.User;
import com.mahiiru.veterinaryrestapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository repository;
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }
}
