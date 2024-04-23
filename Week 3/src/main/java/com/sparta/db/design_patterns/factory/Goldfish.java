package com.sparta.db.design_patterns.factory;

public class Goldfish extends Animal{

    @Override
    public void speak() {
        System.out.println(super.getName() + " stares off into the abyss...");
    }

    public Goldfish(String name) {
        super(name);
    }
}
