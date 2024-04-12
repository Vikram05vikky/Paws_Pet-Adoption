package com.example.Paws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Paws.model.User;
import com.example.Paws.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getProfileById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
