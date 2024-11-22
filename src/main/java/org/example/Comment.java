package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;

@Entity
public class Comment {
    @OneToMany
    @Id
    @GeneratedValue
    Long id;

    String text;
    Date datePosted;
    String Author;
    String associatedRecipe;

    public Comment(Long id, String text, Date datePosted, String author, String associatedRecipe) {
        this.id = id;
        this.text = text;
        this.datePosted = datePosted;
        Author = author;
        this.associatedRecipe = associatedRecipe;
    }

    public Comment() {
    }
}
