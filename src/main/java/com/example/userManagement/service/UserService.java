package com.example.userManagement.service;

import com.example.userManagement.entity.User;
import com.example.userManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void saveUser(User user){
        repository.save(user);
    }
}
