package com.mahiiru.veterinaryrestapi.repositories;

import com.mahiiru.veterinaryrestapi.models.VeterinaryService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinaryServiceRepository extends JpaRepository<VeterinaryService,Long> {
}
