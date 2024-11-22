package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    Long id;

    String text;
    Date datePosted;

    @ManyToOne
    @JoinColumn(name = "person_id")
    Person Author;
    String associatedRecipe;

    public Comment(Long id, String text, Date datePosted, Person author, String associatedRecipe) {
        this.id = id;
        this.text = text;
        this.datePosted = datePosted;
        Author = author;
        this.associatedRecipe = associatedRecipe;
    }

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public Person getAuthor() {
        return Author;
    }

    public String getAssociatedRecipe() {
        return associatedRecipe;
    }
}
