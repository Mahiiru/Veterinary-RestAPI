package com.mahiiru.veterinaryrestapi.repositories;

import com.mahiiru.veterinaryrestapi.models.AppointmentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDetailsRepository extends JpaRepository<AppointmentDetails,Long> {
}
