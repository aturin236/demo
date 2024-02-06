package com.example.demo.service.impl;

import com.example.demo.dao.AppUserDAO;
import com.example.demo.dao.entity.AppUser;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final AppUserDAO appUserDAO;

    @Override
    public AppUser saveUser(AppUser appUser) {
        return appUserDAO.save(appUser);
    }

    @Override
    public List<AppUser> findAll() {
        return appUserDAO.findAll();
    }
}
