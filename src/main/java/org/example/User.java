package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;

@Entity
public class User {
    @OneToMany
    @Id
    @GeneratedValue
    Long id;

    String username;
    String email;
    String password;
    String role;
    Date dateRegistered;

    public User(Long id, String username, String email, String password, String role, Date dateRegistered) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateRegistered = dateRegistered;
    }

    public User() {
    }
}
