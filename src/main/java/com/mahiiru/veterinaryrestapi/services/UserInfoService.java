package com.mahiiru.veterinaryrestapi.services;


import com.mahiiru.veterinaryrestapi.models.UserInfo;
import com.mahiiru.veterinaryrestapi.repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository repository;

    public List<UserInfo> getAllUsersInfo() {
        return repository.findAll();
    }

    public Optional<UserInfo> getUserInfoById(Long id) {
        return repository.findById(id);
    }
}
