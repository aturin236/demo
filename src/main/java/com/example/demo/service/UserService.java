package com.example.demo.service;

import com.example.demo.dao.entity.AppUser;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser var1);
    List<AppUser> findAll();
}
