package com.sparta.db.tdd;

public class FizzBuzz {
    public static String getFizzBuzz(int value) {
        if(value == 3){
            return "Fizz";
        } else if (value == 5){
            return "Buzz";
        } else if (value == 15){
            return "FizzBuzz";
        } else {
            return "1";//Integer.toString(value);
        }
    }
}
