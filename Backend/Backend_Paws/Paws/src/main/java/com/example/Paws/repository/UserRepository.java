package com.example.Paws.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Paws.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByName(String name);

    Optional<User> findByNameAndPass(String name, String pass);

    Optional<User> findById(int id);

    @Query(value = "select * from User where age= ?1", nativeQuery = true)
    List<User> findByAge(int age);

}
