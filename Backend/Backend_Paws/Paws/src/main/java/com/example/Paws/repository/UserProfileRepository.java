package com.example.Paws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Paws.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    UserProfile findByUserId(Long userId);

    UserProfile getByUserId(int id);

    Optional<UserProfile> findById(int id);

    // public List<UserProfile> getPersonsByAge(int age);

}
