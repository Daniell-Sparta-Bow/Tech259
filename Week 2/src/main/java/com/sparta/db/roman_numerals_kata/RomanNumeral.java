package com.sparta.db.roman_numerals_kata;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class RomanNumeral {

    private static Map<Integer, String> numToNumeral = Map.ofEntries(
            entry(1, "I"),
            entry(5, "V"),
            entry(10, "X"),
            entry(50, "L"),
            entry(100, "C"),
            entry(500, "D"),
            entry(1000, "M")
    );



    public static String getNumerable(int number){
        while (number > 0){
            
        }
        return "";

    }

    private static String getNextNumeral(int number){

        return "i";
    }
}
