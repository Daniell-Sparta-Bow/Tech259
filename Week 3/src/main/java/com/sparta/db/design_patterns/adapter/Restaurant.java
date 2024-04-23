package com.sparta.db.design_patterns.adapter;

public class Restaurant {
    private Butcherable butcher;
    public Restaurant(Butcherable butcher){
        this.butcher = butcher;
    }
    public void prepareDish(Animal animal){
        String animalProduct = butcher.prepare(animal);
        System.out.println( animalProduct + " is prepared from " + animal.getSpecies());
    }
}
