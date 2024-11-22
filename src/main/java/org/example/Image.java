package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Image {
    @OneToMany
    @Id
    @GeneratedValue
    Long id;

    String filename;
    String filedata;
    String associatedRecipe;

    public Image(Long id, String filename, String filedata, String associatedRecipe) {
        this.id = id;
        this.filename = filename;
        this.filedata = filedata;
        this.associatedRecipe = associatedRecipe;
    }

    public Image() {
    }
}
