package com.mahiiru.veterinaryrestapi.repositories;

import com.mahiiru.veterinaryrestapi.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
