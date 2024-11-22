package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;

@Entity
public class Rating {
    @OneToMany
    @Id
    @GeneratedValue
    Long id;

    int value;
    Date rated;
    String associatedRecipe;
    String rater;

    public Rating(Long id, int value, Date rated, String associatedRecipe, String rater) {
        this.id = id;
        this.value = value;
        this.rated = rated;
        this.associatedRecipe = associatedRecipe;
        this.rater = rater;
    }

    public Rating() {
    }
}
