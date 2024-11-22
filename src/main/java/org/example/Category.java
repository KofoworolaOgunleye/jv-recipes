package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
    @Id
    @GeneratedValue
    Long id;

    String Name;

    public Category(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Category() {
    }

    public Category(String name) {
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
