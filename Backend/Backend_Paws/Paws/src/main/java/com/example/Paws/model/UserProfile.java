// package com.example.Paws.model;

// import com.fasterxml.jackson.annotation.JsonBackReference;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "user_profile")
// public class UserProfile {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String bio;

//     // @JsonIgnore
//     @OneToOne
//     @JsonBackReference
//     private User user;

//     public UserProfile() {
//     }

//     public UserProfile(Long id, String bio, User user) {
//         this.id = id;
//         this.bio = bio;
//         this.user = user;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getBio() {
//         return bio;
//     }

//     public void setBio(String bio) {
//         this.bio = bio;
//     }

//     public User getUser() {
//         return user;
//     }

//     public void setUser(User user) {
//         this.user = user;
//     }

// }

package com.example.Paws.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

// import javax.persistence.*;

@Entity
@Table(name = "user_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    public UserProfile() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}