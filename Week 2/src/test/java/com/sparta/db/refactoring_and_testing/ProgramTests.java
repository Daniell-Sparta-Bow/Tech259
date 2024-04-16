package com.sparta.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {
    @Test
    @DisplayName("My First Test")
    void firstTest(){
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Give a time of 21, getGreeting() returns \"Good evening!\"")
    void givenATimeOf21_GetGreeting_ReturnsGoodEvening(){
        // Arrange
        var time = 21;
        var expectedGreeting = "Good evening!";
        // Act
        var result = Program.getGreeting(time);
        // Assert
        Assertions.assertEquals(expectedGreeting, result);
    }
    @Test
    @DisplayName("Give a time of 15, getGreeting() returns \"Good afternoon!\"")
    void givenATimeOf15_GetGreeting_ReturnsGoodAfternoon(){
        // Arrange
        var time = 15;
        var expectedGreeting = "Good afternoon!";
        // Act
        var result = Program.getGreeting(time);
        // Assert
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 11})
    @DisplayName("Give a time of 8, getGreeting() returns \"Good morning!\"")
    void givenATimeOf8_GetGreeting_ReturnsGoodMorning(int time){
        // Arrange

        var expectedGreeting = "Good morning!";
        // Act
        var result = Program.getGreeting(time);
        // Assert
        Assertions.assertEquals(expectedGreeting, result);
    }
}
