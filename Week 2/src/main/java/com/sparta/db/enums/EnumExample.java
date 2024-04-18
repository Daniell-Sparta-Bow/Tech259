package com.sparta.db.enums;

import static java.lang.String.valueOf;

public class EnumExample {

//    Different implementations of enums.
//    public enum Day {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//    public static final int MONDAY = 0;
//    public static final int TUESDAY = 1;
//    public static final int WEDNESDAY = 2;
//    public static final int THURSDAY = 3;
//    public static final int FRIDAY = 4;
//    public static final int SATURDAY = 5;
//    public static final int SUNDAY = 6;

    public static void main(String[] args) {

//        Day dayOfWeek;
//
//        dayOfWeek = Day.SUNDAY;
//
//
//        if (dayOfWeek == Day.SATURDAY || dayOfWeek.equals(Day.SUNDAY)){
//            System.out.println("Its the weekend");
//        } else {
//            System.out.println("It's a weekday");
//        }


        PizzaSize size = PizzaSize.SMALL;

        System.out.println("Size: " + size.getSize());
        System.out.println("Calories: " + size.getCalories());
        System.out.println("Energy: " + size.getEnergyInJoules() + " Joules");

        for (PizzaSize s: PizzaSize.values()){
            System.out.println(s.ordinal());
        }

        PizzaSize medium = PizzaSize.valueOf("MEDIUM");
        System.out.println(medium.getSize());
    }
}
