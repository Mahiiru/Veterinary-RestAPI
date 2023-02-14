package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.UserOrder;
import com.mahiiru.veterinaryrestapi.repositories.UserOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserOrderService {

    @Autowired
    private UserOrderRepository repository;

    public List<UserOrder> getAllOrders() {
        return repository.findAll();
    }

    public Optional<UserOrder> getOrderById(Long id) {
        return repository.findById(id);
    }
}
