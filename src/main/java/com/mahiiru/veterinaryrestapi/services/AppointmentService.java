package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;
}
