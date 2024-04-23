package com.sparta.db.design_patterns.factory;

public class AnimalFactory {
    public static Animal getAnimal(String name){
        return switch (name) {
            case "fred" -> new Cat(name);
            case "bob" -> new Goldfish("Simon");
            default -> null;
        };
    }
}
