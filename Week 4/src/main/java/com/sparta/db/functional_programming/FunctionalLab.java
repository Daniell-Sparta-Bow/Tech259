package com.sparta.db.functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;

public class FunctionalLab {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Daniell", "Alex", "Brian"));
        System.out.println(getNamesWithExactly2Vowels(names));
    }

    public static ArrayList<String> getNamesWithExactly2Vowels(ArrayList<String> listOfNames){
        ArrayList<String> namesWith2Vowels = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'o', 'i', 'u'));

        for (String name: listOfNames){

            long vowelCount = name.toLowerCase().chars()
                    .filter(letter -> 'a' <= letter && letter <= 'z')
                    .filter(letter -> vowels.contains((char) letter))
                    .count();
            if (vowelCount == 2){
                namesWith2Vowels.add(name);
            }
        }

        return namesWith2Vowels;
    }
}
