package com.example.Paws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Paws.model.User;
import com.example.Paws.model.UserProfile;
import com.example.Paws.service.UserProfileService;
import com.example.Paws.service.UserService;

@RestController
@RequestMapping("/api/userprofile")
@CrossOrigin("*")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private UserService userService;

    @PostMapping("/user/{id}")
    public ResponseEntity<UserProfile> addAddress(@RequestBody UserProfile userProfile, @PathVariable("id") Long id) {
        User user = userService.getProfileById(id);
        userProfile.setUser(user);
        return new ResponseEntity<>(userProfileService.create(userProfile), HttpStatus.OK);
    }

    // @GetMapping("/user/{age}")
    // public ResponseEntity<User>
}
