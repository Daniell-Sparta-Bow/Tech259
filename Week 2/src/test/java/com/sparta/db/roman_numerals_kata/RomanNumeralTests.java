package com.sparta.db.roman_numerals_kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanNumeralTests {

    @Test
    @DisplayName("Given an input of 1 getNumerable() should return a value of \"I\"")
    void givenAnInputOf1_getNumerable_returns_I(){
        // Arrange
        int input = 1;
        String result;

        // Act
        result = RomanNumeral.getNumerable(input);

        // Assert
        Assertions.assertEquals("I", result);

    }

    @Test@DisplayName("Given an input of 5 getNumerable() should return a value of \"V\"")
    void givenAnInputOf5_getNumerable_returns_V(){
        // Arrange
        int input = 5;
        String result;

        // Act
        result = RomanNumeral.getNumerable(input);

        // Assert
        Assertions.assertEquals("V", result);
    }

    @Test
    @DisplayName("Given an input of 2 getNumerable() returns a value of \"II\"")
    void givenAnInputOf2_getNumerable_returns_II(){
        // Arrange
        int input = 2;
        String result;

        // Act
        result = RomanNumeral.getNumerable(input);

        // Assert
        Assertions.assertEquals("II", result);

    }

    @Test
    @DisplayName("Given an input of 4 getNumerable() returns a value of \"IV\"")
    void givenAnInputOf4_getNumerable_returns_IV(){
        // Arrange
        int input = 4;
        String result;

        // Act
        result = RomanNumeral.getNumerable(input);

        // Assert
        Assertions.assertEquals("IV", result);
    }

}
// Input Partitioning