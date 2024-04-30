package com.sparta.db.file_io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTests {

    @Test
    @DisplayName("check for exceptions")
    void checkForExceptions() {
        // Arrange

        // Act

        // Assert
        Assertions.assertThrowsExactly(ArithmeticException.class, () -> System.out.println(1/0));

    }
}
