package com.sparta.db.roman_numerals_kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanNumeralTests {

    @Test
    @DisplayName("Given an input of 1 getNumerable() should return a value of \"i\"")
    void givenAnInputOf1_getNumerable_returns_i(){
        // Arrange
        int input = 1;
        String result;

        // Act
        result = RomanNumeral.getNumerable(input);

        // Assert
        Assertions.assertEquals("i", result);

    }

    @Test@DisplayName("Given an input of 5 getNumerable() should return a value of \"v\"")
    void givenAnInputOf5_getNumerable_returns_v(){
        // Arrange
        int input = 5;
        String result;

        // Act
        result = RomanNumeral.getNumerable(input);

        // Assert
        Assertions.assertEquals("v", result);
    }

    @Test
    @DisplayName("Given an input of 2 getNumerable() returns a value of \"ii\"")
    void givenAnInputOf2_getNumerable_returns_ii(){
        // Arrange
        int input = 2;
        String result;

        // Act
        result = RomanNumeral.getNumerable(input);

        // Assert
        Assertions.assertEquals("ii", result);

    }

}
