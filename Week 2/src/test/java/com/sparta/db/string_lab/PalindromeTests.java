package com.sparta.db.string_lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class PalindromeTests {
    @Test
    @DisplayName("Given an input of racecar, isPalindrome returns true ")
    void givenAnInputOfRacecarIsPalindromeReturnsTrue() {
        // Arrange
        String input = "racecar";
        // Act
        boolean result = Palindrome.isPalindrome(input);

        // Assert
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("Given an input of Daniel, isPalindrome returns false")
    void givenAnInputOfDanielIsPalindromeReturnsFalse() {
        // Arrange
        String input = "Daniel";

        // Act
        boolean result = Palindrome.isPalindrome(input);

        // Assert
        Assertions.assertFalse(result);

    }

    @Test
    @DisplayName("Given an input of aa, isPalindrome returns false")
    void givenAnInputOfAaIsPalindromeReturnsFalse() {
        // Arrange
        String input = "aa";
        // Act
        boolean result = Palindrome.isPalindrome(input);

        // Assert
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Given an input of mom, isPalindrome returns true")
    void givenAnInputOfMomIsPalindromeReturnsTrue() {
        // Arrange
        String input = "mom";
        // Act
        boolean result = Palindrome.isPalindrome(input);
        // Assert

        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Given an input of Mom, isPalindrome returns true instead of false")
    void givenAnInputOfMomIsPalindromeReturnsTrueInsteadOfFalse() {
        // Arrange
        String input = "Mom";

        // Act
        boolean result = Palindrome.isPalindrome(input);

        // Assert
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("given an input of mom, racecar and tattarrattat getLargestPalindrome returns tattarrattat")
    void givenAnInputOfMomRacecarAndTattarrattatGetLargestPalindromeReturnsTattarrattat() {
        // Arrange
        String[] input = {"mom", "racecar", "tattarrattat"};
        // Act
        String result = Palindrome.getLargestPalindrome(input);
        // Assert
        Assertions.assertEquals("tattarrattat", result);

    }

    @Test
    @DisplayName("Given an input of rabbit, alexander, java and computer getLargestPalindrome returns an emptyString")
    void givenAnInputOfRabbitAlexanderJavaAndComputerGetLargestPalindromeReturnsAnEmptyString() {
        // Arrange
        String[] input = {"rabbit", "alexander", "java", "computer"};
        // Act
        String result = Palindrome.getLargestPalindrome(input);
        // Assert
        Assertions.assertEquals("", result);


    }

}
