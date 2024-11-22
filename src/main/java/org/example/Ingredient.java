package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Ingredient {

    @OneToMany
    @Id
    @GeneratedValue
    Long id;
    String name;
    String quantity;
    String unitOfMeasurement;

    public Ingredient(Long id, String name, String quantity, String unitOfMeasurement) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public Ingredient() {
    }
}
