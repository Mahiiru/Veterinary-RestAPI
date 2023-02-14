package com.mahiiru.veterinaryrestapi.repositories;

import com.mahiiru.veterinaryrestapi.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
}
