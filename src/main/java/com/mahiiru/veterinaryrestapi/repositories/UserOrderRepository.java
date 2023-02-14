package com.mahiiru.veterinaryrestapi.repositories;

import com.mahiiru.veterinaryrestapi.models.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrderRepository extends JpaRepository<UserOrder,Long> {
}
