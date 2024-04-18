package com.sparta.db.roman_numerals_kata;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class RomanNumeral {

    private static TreeMap<Integer, String> numToNumeral = new TreeMap<Integer, String>();

            static {
                numToNumeral.put(1000, "M");
                numToNumeral.put(500, "D");
                numToNumeral.put(100, "C");
                numToNumeral.put(50, "L");
                numToNumeral.put(10, "X");
                numToNumeral.put(5, "V");
                numToNumeral.put(1, "I");
            }





    // getRomanNumeralFromInt
    public static String getNumerable(int input){ // clearer parameter name
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = ""; // Clearer name
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }

}
