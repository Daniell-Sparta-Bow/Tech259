package com.sparta.db.enums;

public enum PizzaSize {
    SMALL("Small pizza", 500),
    MEDIUM("Medium pizza", 680),
    LARGE("Large pizza", 920),
    EXTRALARGE("Extra large pizza", 1200);



    private final String pizzaSize;


    private final int calories;
    PizzaSize(String size, int calories) {
        pizzaSize = size;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
    public String getSize() {
        return pizzaSize;
    }

    public int getEnergyInJoules(){
        return (int)(this.calories * 4.184);
    }
}
