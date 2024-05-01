package com.sparta.db.functional_programming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Method - every letter in the alphabet
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Paul", "George", "Ringo"));
        names.stream() // Convert to a Stream
                .filter(name -> name.contains("o")) // filter and map are Intermediate operations -> returns another stream.
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name)); // Terminal Operation -> returns a concrete type or void - but not a stream.

        String allLetters = "The quick brown fox jumps over the lazy dog";
        ArrayList<Character> allChars = new ArrayList<>();
        for (char letter : allLetters.toCharArray()) {
            allChars.add(letter);
        }
        System.out.println(allCharactersArePresent(allChars));
    }



        public static boolean allCharactersArePresent(ArrayList<Character> characterList){
            return characterList.stream()
                    .map(Character::toUpperCase)
                    .distinct()
                    .peek(System.out::println)
                    .allMatch(character -> 'A' <= character && character <= 'Z');

    }
}

// You can chain as many intermediate operations as you like
// Most functions in the stream class will return a stream -> hence it is intermediate
// You can not add an intermediate operation to a terminal operation