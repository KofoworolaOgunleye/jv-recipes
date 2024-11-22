package org.example;

import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Recipe {

    @OneToMany
    @Id
    @GeneratedValue
    Long id;
    String title;
    String description;
    String instructions;
    int preparationTime;
    int cookingTime;
    int servings;
    String difficultyLevel;

    @OneToMany
    int rating;

    @OneToMany
    String listOfIngredients;

    @ManyToMany
    String listOfCategories;

    @OneToOne
    String creator;

    Date dateCreated;
    Date lastModified;

    public Recipe(Long id, String title, String description, String instructions, int preparationTime, int cookingTime, int servings, String difficultyLevel, int rating, String listOfIngredients, String listOfCategories, String creator, Date dateCreated, Date lastModified) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructions = instructions;
        this.preparationTime = preparationTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.difficultyLevel = difficultyLevel;
        this.rating = rating;
        this.listOfIngredients = listOfIngredients;
        this.listOfCategories = listOfCategories;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.lastModified = lastModified;
    }

    public Recipe(){

    }
}
