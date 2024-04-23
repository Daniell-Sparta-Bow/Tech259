package com.sparta.db.design_patterns.adapter;

public class App {
    public static void main(String[] args) {
        Animal cow = new Animal("cow");
        Butcherable butcher = new AnimalButcherAdapter();
        Restaurant gourmetRestaurant = new Restaurant(butcher);
        gourmetRestaurant.prepareDish(cow);
    }
}
