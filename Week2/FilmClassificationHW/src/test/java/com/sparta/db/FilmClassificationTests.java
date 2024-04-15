package com.sparta.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {

    @ParameterizedTest
    @ValueSource(ints = {18, 44, 100})
    @DisplayName("Given age is greater than 18, getClassificationByAge() returns \"All films are available\"")
    void givenAgeIsGreaterThan18_getClassificationByAge_ReturnsAllFilmsAvailable(int age) {
        // Arrange
        String expectedResult = "All films are available.";
        // Act
        String actualResult = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Given age is between 15 and 17 inclusive, getClassificationByAge() returns \"U, PG, 12 & 15 films are available.\"")
    void givenAgeIsBetween15And18_getClassificationByAge_ReturnsU_PG_12_15(int age) {
        //Arrange
        String expectedResult = "U, PG, 12 & 15 films are available.";
        // Act
        String actualResult = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Given age is between 12 and 14 inclusive, getClassificationByAge() returns \"U, PG, 12 & 15 films are available.\"")
    void givenAgeIsBetween12And15_getClassificationByAge_ReturnsU_PG_12(int age) {
        // Arrange
        String expectedResult = "U, PG & 12 films are available.";
        // Act
        String actualResult = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 10, 11})
    @DisplayName("Given age is between 8 and 11 inclusive, getClassificationByAge() returns \"U & PG films are available, if accompanied by an adult you may watch 12A films.\"")
    void givenAgeIsBetween8And12_getClassificationByAge_ReturnsU_PG_12A(int age) {
        // Arrange
        String expectedResult = "U & PG films are available, if accompanied by an adult you may watch 12A films.";
        // Act
        String actualResult = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 7})
    @DisplayName("Given age is between 4 and 7 inclusive, getClassificationByAge() returns \"U films are available.\"")
    void givenAgeIsBetween8And12_getClassificationByAge_ReturnsU(int age) {
        // Arrange
        String expectedResult = "U films are available.";
        // Act
        String actualResult = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 2, 1})
    @DisplayName("Given age is between 8 and 11 inclusive, getClassificationByAge() returns \"U & PG films are available, if accompanied by an adult you may watch 12A films.\"")
    void givenAgeLessThan4_getClassificationByAge_ReturnsNoFilmsAvailable(int age) {
        // Arrange
        String expectedResult = "No films are available.";
        // Act
        String actualResult = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
