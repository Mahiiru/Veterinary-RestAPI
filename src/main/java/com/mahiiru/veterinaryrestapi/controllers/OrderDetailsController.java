package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.OrderDetails;
import com.mahiiru.veterinaryrestapi.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/ordersdetails")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService service;

    @GetMapping
    public ResponseEntity<List<OrderDetails>> getAllOrdersDetails(){
        return ResponseEntity.ok(service.getAllOrdersDetails());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Optional<OrderDetails>> getOrderDetailsById(@PathVariable Long id){
        return ResponseEntity.ok(service.getOrderDetailsById(id));
    }
}
