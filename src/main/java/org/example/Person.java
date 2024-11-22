package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;

@Entity
public class Person {
    @Id
    @GeneratedValue
    Long id;

    String username;
    String email;
    String password;
    String role;
    LocalDate dateRegistered;

    public Person(Long id, String username, String email, String password, String role, LocalDate dateRegistered) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateRegistered = dateRegistered;
    }

    public Person() {
    }

    public Person(String username, String email, String password, String role, LocalDate dateRegistered) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateRegistered = dateRegistered;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }
}
