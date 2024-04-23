package com.sparta.db.design_patterns.adapter;

public class Animal { // The class to adapt
    private String species;

    public String getSpecies() {
        return species;
    }

    public Animal(String species) {
        this.species = species;
    }
}
