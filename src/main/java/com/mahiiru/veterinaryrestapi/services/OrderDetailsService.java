package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.OrderDetails;
import com.mahiiru.veterinaryrestapi.repositories.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailsService {

    @Autowired
    private OrderDetailsRepository repository;
    public List<OrderDetails> getAllOrdersDetails() {
        return  repository.findAll();
    }

    public Optional<OrderDetails> getOrderDetailsById(Long id) {
        return repository.findById(id);
    }
}
