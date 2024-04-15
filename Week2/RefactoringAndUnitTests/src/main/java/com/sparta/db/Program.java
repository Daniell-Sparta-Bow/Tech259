package com.sparta.db;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        String greeting = getGreeting(timeOfDay);
    }

    public static String getGreeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            return "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}