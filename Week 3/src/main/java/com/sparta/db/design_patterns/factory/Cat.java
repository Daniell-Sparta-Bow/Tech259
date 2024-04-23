package com.sparta.db.design_patterns.factory;

public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println(super.getName() + " says meow");
    }

    public Cat(String name) {
        super(name);
    }
}
