package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.AppointmentDetails;
import com.mahiiru.veterinaryrestapi.services.AppointmentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/appointmentsDetails")
public class AppointmentDetailsController {

    @Autowired
    private AppointmentDetailsService service;

    @GetMapping
    public ResponseEntity<List<AppointmentDetails>> getAllAppointmentsDetails(){
        return ResponseEntity.ok(service.getAllAppointmentsDetails());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<AppointmentDetails>> getAppointmentDetailsById(@PathVariable Long id){
        return ResponseEntity.ok(service.getAppointmentDetailsById(id));
    }
}
