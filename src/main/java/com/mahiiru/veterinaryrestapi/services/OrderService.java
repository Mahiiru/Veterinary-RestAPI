package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.Order;
import com.mahiiru.veterinaryrestapi.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return repository.findById(id);
    }
}
