package org.example;

import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Recipe {


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

    LocalDate dateCreated;
    LocalDate lastModified;

    public Recipe(Long id, String title, String description, String instructions, int preparationTime, int cookingTime,
                  int servings, String difficultyLevel, int rating, String listOfIngredients, String listOfCategories,
                  String creator, LocalDate dateCreated, LocalDate lastModified) {
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

/*
    public Recipe(String title, String description, String instructions, int preparationTime, int cookingTime,
                  int servings, String difficultyLevel, int rating, String listOfIngredients,
                  String listOfCategories, String creator, LocalDate dateCreated, LocalDate lastModified) {
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

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public int getServings() {
        return servings;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public int getRating() {
        return rating;
    }

    public String getListOfIngredients() {
        return listOfIngredients;
    }

    public String getListOfCategories() {
        return listOfCategories;
    }

    public String getCreator() {
        return creator;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public LocalDate getLastModified() {
        return lastModified;
    }
}*/
