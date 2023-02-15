package com.mahiiru.veterinaryrestapi.services;

import com.mahiiru.veterinaryrestapi.models.AppointmentDetails;
import com.mahiiru.veterinaryrestapi.repositories.AppointmentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentDetailsService {

    @Autowired
    private AppointmentDetailsRepository repository;

    public List<AppointmentDetails> getAllAppointmentsDetails() {
        return repository.findAll();
    }

    public Optional<AppointmentDetails> getAppointmentDetailsById(Long id) {
        return repository.findById(id);
    }
}
