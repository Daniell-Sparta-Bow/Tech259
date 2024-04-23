package com.sparta.db.design_patterns.factory;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println(super.getName() + "says woof");
    }

    public Dog(String name) {
        super(name);
    }
}
