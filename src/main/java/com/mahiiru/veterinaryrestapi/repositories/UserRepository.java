package com.mahiiru.veterinaryrestapi.repositories;

import com.mahiiru.veterinaryrestapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
