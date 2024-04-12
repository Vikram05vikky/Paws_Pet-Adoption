// package com.example.Paws.model;

// import com.fasterxml.jackson.annotation.JsonManagedReference;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToOne;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "user")
// public class User {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String name;
//     private String phone;
//     private int age;
//     private String email;
//     private String pass;
//     private String cpass;
//     private String address;

//     @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//     @JoinColumn(name = "user_profile_id")
//     @JsonManagedReference
//     private UserProfile userProfile;

//     public User() {
//     }

//     public User(Long id, String name, String phone, int age, String email, String pass, String cpass, String address,
//             UserProfile userProfile) {

//         this.id = id;
//         this.name = name;
//         this.phone = phone;
//         this.age = age;
//         this.email = email;
//         this.pass = pass;
//         this.cpass = cpass;
//         this.address = address;
//         this.userProfile = userProfile;
//     }

//     public UserProfile getUserProfile() {
//         return userProfile;
//     }

//     public void setUserProfile(UserProfile userProfile) {
//         this.userProfile = userProfile;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getPhone() {
//         return phone;
//     }

//     public void setPhone(String phone) {
//         this.phone = phone;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public String getPass() {
//         return pass;
//     }

//     public void setPass(String pass) {
//         this.pass = pass;
//     }

//     public String getCpass() {
//         return cpass;
//     }

//     public void setCpass(String cpass) {
//         this.cpass = cpass;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public void setAddress(String address) {
//         this.address = address;
//     }

// }

package com.example.Paws.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

// import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private int age;
    private String email;
    private String pass;
    private String cpass;
    private String address;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference
    private UserProfile userProfile;

    public User() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}