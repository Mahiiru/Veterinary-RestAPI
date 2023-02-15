package com.mahiiru.veterinaryrestapi.services;

import com.mahiiru.veterinaryrestapi.repositories.AppointmentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentDetailsService {

    @Autowired
    private AppointmentDetailsRepository repository;
}
