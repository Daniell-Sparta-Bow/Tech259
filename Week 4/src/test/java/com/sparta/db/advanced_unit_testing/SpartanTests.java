package com.sparta.db.advanced_unit_testing;



import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;

public class SpartanTests {
    private Spartan spartan;
    private Spartan badSpartan;
    private final ArrayList<String> validCourse = new ArrayList<>(Arrays.asList("Java", "C#", "Data", "DevOps", "Cyber-Security", "Business", "Test"));

    @BeforeEach
    void setup(){
        spartan = new Spartan(30, "Daniell", "Java", LocalDate.of(2025, 4, 8));
        badSpartan = new Spartan(5, "Bad", "Python", LocalDate.of(1700,1,12));

    }

    @Nested
    @DisplayName("Spartan ID Tests")
    class SpartanIDTests{
        @Test
        @DisplayName("check spartan id is greater than 10")
        void checkSpartanIdIsGreaterThan10() {
            Assertions.assertTrue(spartan.getId() > 10);

        }

        @Test
        @DisplayName("check spartan id is less than 10,000")
        void checkSpartanIdIsLessThan10_000() {
            Assertions.assertTrue(spartan.getId() < 10_000);
        }

        @Test
        @DisplayName("check that spartan id is changed to new id")
        void checkThatSpartanIdIsChangedToNewId() {

            // Act
            spartan.setId(15);
            // Assert
            Assertions.assertEquals(15, spartan.getId());

        }

        @Test
        @DisplayName("check that spartan id is not valid")
        void checkThatSpartanIdIsNotValid() {
            Assertions.assertFalse(badSpartan.getId() > 10 && badSpartan.getId() < 10000);
        }
    }

    @Nested
    @DisplayName("Spartan Name Tests")
    class SpartanNameTests {
        @Test
        @DisplayName("check that spartan name ends with 'niell'")
        void checkThatSpartanNameEndsWithNiell() {

            Assertions.assertTrue(spartan.getName().endsWith("niell"));

        }

        @Test
        @DisplayName("check that spartan name is not null")
        void checkThatSpartanNameIsNotNull() {
            Assertions.assertNotNull(spartan.getName());
        }

        @Test
        @DisplayName("check that spartan's name can change")
        void checkThatSpartanSNameCanChange() {
            spartan.setName("NewMe");
            Assertions.assertEquals("NewMe", spartan.getName());
        }

        @Test
        @DisplayName("check that spartan name is 'Daniell'")
        void checkThatSpartanNameIsDaniell() {
            Assertions.assertEquals("Daniell", spartan.getName());


        }
    }

    @Nested
    @DisplayName("Spartan Course Tests")
    class SpartanCourseTests {

        @Test
        @DisplayName("check that spartan with Java as a valid course exists")
        void checkThatSpartanWithValidCourse() {
            Assertions.assertTrue(validCourse.contains(spartan.getCourse()));
        }

        @Test
        @DisplayName("check that spartan with C# as a valid course exists")
        void checkThatSpartanWithCAsAValidCourse() {
            spartan.setCourse("C#");
            Assertions.assertTrue(validCourse.contains(spartan.getCourse()));
        }

        @Test
        @DisplayName("check that spartan don't have a valid course")
        void checkThatSpartanDonTHaveAValidCourse() {
            Assertions.assertFalse(validCourse.contains(badSpartan.getCourse()));
        }
    }

    @Nested
    @DisplayName("Spartan StartDate Tests")
    class SpartanStartDateTests{
        @Test
        @DisplayName("check that spartan start date is in the future")
        void checkThatSpartanStartDateIsInTheFuture() {
            // Arrange
            LocalDate now = LocalDate.now();
            LocalDate startDate = spartan.getStartDate();


            // Assert
            Assertions.assertTrue(startDate.isAfter(now));

        }

        @Test
        @DisplayName("check that spartan start date is in the past")
        void checkThatSpartanStartDateIsInThePast() {
            // Arrange
            LocalDate now = LocalDate.now();

            // Act

            // Assert
            Assertions.assertTrue(now.isAfter(badSpartan.getStartDate()));

        }

        @Test
        @DisplayName("check that spartan start date can be changed")
        void checkThatSpartanStartDateCanBeChanged() {
            // Arrange
            LocalDate now = LocalDate.now();
            // Act
            spartan.setStartDate(now);
            // Assert
            Assertions.assertEquals(now, spartan.getStartDate());

        }

    }

    @Nested
    @DisplayName("Spartan Override Method Tests")
    class SpartanOverrideMethodTests{
        @Test
        @DisplayName("check that spartan.toString() contains name")
        void checkThatSpartanToStringContainsName() {
            // Arrange
            String result = spartan.toString();
            // Act

            // Assert
            Assertions.assertTrue(result.contains(spartan.getName()));

        }

        @Test
        @DisplayName("check that spartan.toString contain id")
        void checkThatSpartanToStringContainId() {
            // Arrange
            String expected = String.valueOf(spartan.getId());
            String result = spartan.toString();
            // Act

            // Assert
            Assertions.assertTrue(result.contains(expected));

        }

        @Test
        @DisplayName("check that spartan.toString contains course")
        void checkThatSpartanToStringContainsCourse() {
            // Arrange
            String result = spartan.toString();
            // Act

            // Assert
            Assertions.assertTrue(result.contains(spartan.getCourse()));

        }

        @Test
        @DisplayName("check that spartan.toString contains start date")
        void checkThatSpartanToStringContainsStartDate() {
            // Arrange
            String expected = spartan.getStartDate().toString();
            String result = spartan.toString();
            // Act

            // Assert
            Assertions.assertTrue(spartan.toString().contains(expected));

        }
    }
}
