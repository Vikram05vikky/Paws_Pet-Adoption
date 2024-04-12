package com.example.Paws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Paws.model.UserProfile;
import com.example.Paws.repository.UserProfileRepository;

@Service
public class UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    public UserProfile create(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

}
