package com.sparta.db.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TDD {
    //Fizz Buzz
    // Div by 3 -> Fizz
    // Div by 5 -> Buzz
    // Div by 3 and 5 -> FizzBuzz

    @Test
    @DisplayName("check that 3 returns Fizz")
    void checkThat3ReturnsFizz() {
        // Arrange

        // Act

        // Assert
        Assertions.assertEquals("Fizz", FizzBuzz.getFizzBuzz(3));

    }

    @Test
    @DisplayName("check that 5 returns Buzz")
    void checkThat5ReturnsBuzz() {
        // Arrange

        // Act

        // Assert
        Assertions.assertEquals("Buzz", FizzBuzz.getFizzBuzz(5));

    }

    @Test
    @DisplayName("check that 15 returns FizzBuzz")
    void checkThat15ReturnsFizzBuzz() {
        // Arrange

        // Act

        // Assert
        Assertions.assertEquals("FizzBuzz", FizzBuzz.getFizzBuzz(15));

    }

    @Test
    @DisplayName("check that 1 returns 1")
    void checkThat1Returns1() {
        // Arrange

        // Act

        // Assert
        Assertions.assertEquals("1", FizzBuzz.getFizzBuzz(1));

    }
}
