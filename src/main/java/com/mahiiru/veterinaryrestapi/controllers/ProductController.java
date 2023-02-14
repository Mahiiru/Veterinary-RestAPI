package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.Product;
import com.mahiiru.veterinaryrestapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(service.getAllProducts());
    }

    @GetMapping
    @RequestMapping
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable Long id){
        return ResponseEntity.ok(service.getProductById(id));
    }
}
