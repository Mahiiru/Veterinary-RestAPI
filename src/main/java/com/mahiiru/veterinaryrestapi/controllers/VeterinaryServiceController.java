package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.services.VeterinaryServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/veterinaryServices")
public class VeterinaryServiceController {

    @Autowired
    private VeterinaryServiceService service;
}
