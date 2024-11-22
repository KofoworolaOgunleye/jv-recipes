package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Tag {
    @OneToMany
    @Id
    @GeneratedValue
    Long id;

    String name;

    public Tag(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tag() {
    }
}
