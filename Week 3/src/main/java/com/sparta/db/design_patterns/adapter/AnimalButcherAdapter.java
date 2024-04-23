package com.sparta.db.design_patterns.adapter;

public class AnimalButcherAdapter implements Butcherable{

    @Override
    public String prepare(Animal animal) {

        return switch(animal.getSpecies()){
            case ("cow") -> "beef";
            case ("pig") -> "pork";
            case ("sheep") -> "mutton";
            default -> animal.getSpecies();
        };
    }
}
