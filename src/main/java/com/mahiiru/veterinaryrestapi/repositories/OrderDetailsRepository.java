package com.mahiiru.veterinaryrestapi.repositories;

import com.mahiiru.veterinaryrestapi.models.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
}
