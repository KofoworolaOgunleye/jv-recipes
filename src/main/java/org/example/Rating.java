package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    Long id;

    int value;
    Date rated;

   /* @ManyToOne
    @JoinColumn(name = "recipe_id")*/
    String associatedRecipe;


    @ManyToOne
    @JoinColumn(name ="person_id")
    Person author;

    public Rating(Long id, int value, Date rated, String associatedRecipe, Person author) {
        this.id = id;
        this.value = value;
        this.rated = rated;
        this.associatedRecipe = associatedRecipe;
        this.author = author;
    }

    public Rating() {
    }

    public Long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public Date getRated() {
        return rated;
    }

    public String getAssociatedRecipe() {
        return associatedRecipe;
    }

    public Person getAuthor() {
        return author;
    }
}
