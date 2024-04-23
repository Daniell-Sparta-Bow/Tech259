package com.sparta.db.design_patterns.factory;

public class App {
    public static void main(String[] args) {
        Animal fred = AnimalFactory.getAnimal("bob");
        fred.speak();
    }
}
