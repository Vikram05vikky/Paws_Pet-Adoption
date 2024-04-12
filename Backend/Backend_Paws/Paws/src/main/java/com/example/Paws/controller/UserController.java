package com.example.Paws.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
// import org.apache.catalina.connector.Response;
// import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Paws.model.User;
import com.example.Paws.repository.UserRepository;

@RestController
@RequestMapping("api/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        if (userRepository.existsByName(user.getName())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists!");
        }

        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully!");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        Optional<User> optionalUser = userRepository.findByNameAndPass(user.getName(), user.getPass());
        if (optionalUser.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body("Login successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password!");
        }
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("get/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("put/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            user.setId(id);
            userRepository.save(user);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("del/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{pageNumber}/{pageSize}/{field}")
    public List<User> getsorting(@PathVariable int pageNumber, @PathVariable int pageSize,
            @PathVariable String field) {
        return userRepository.findAll(PageRequest.of(pageNumber, pageSize)
                .withSort(Sort.by(Sort.Direction.ASC, field))).getContent();
    }

    @GetMapping("/age/{age}")
    public ResponseEntity<List<User>> getUserByAge(@PathVariable int age) {
        List<User> userage = userRepository.findByAge(age);
        return ResponseEntity.ok(userage);
    }
}
