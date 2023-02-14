package com.mahiiru.veterinaryrestapi.controllers;


import com.mahiiru.veterinaryrestapi.models.UserInfo;
import com.mahiiru.veterinaryrestapi.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/UsersInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService service;

    @GetMapping
    private ResponseEntity<List<UserInfo>> getAllUsersInfo(){
        return ResponseEntity.ok(service.getAllUsersInfo());
    }

    @GetMapping
    @RequestMapping("/{id}")
    private ResponseEntity<Optional<UserInfo>> getUserInfoById(@PathVariable Long id){
        return ResponseEntity.ok(service.getUserInfoById(id));
    }
}
