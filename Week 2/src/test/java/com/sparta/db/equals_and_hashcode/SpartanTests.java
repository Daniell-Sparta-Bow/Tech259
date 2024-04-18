package com.sparta.db.equals_and_hashcode;

import org.junit.jupiter.api.*;

import java.util.Objects;

public class SpartanTests {

    // Hooks
    // BeforeAll (static), BeforeEach, AfterAll (static), AfterEach

    static Spartan manish;

    @BeforeAll
    static void SetupAll(){
        manish = new Spartan("Manish", "Gadhvi");
    }

    @RepeatedTest(10)
    @DisplayName("check that a spartan is equal to itself")
    void checkThatASpartanIsEqualToItself(){
        Spartan manish = new Spartan("Manish", "Gadvi");

        Assertions.assertTrue(manish.equals(manish));
    }

    @Test
    @DisplayName("check a spartan against null")
    void checkASpartanAgainstNull(){
        Spartan manish = new Spartan("Manish", "Gadvi");

        Assertions.assertFalse(manish.equals(null));
    }



    @Test
    @DisplayName("Check a spartan against another class")
    void checkASpartanAgainstAnotherClass(){
        Spartan manish = new Spartan("Manish", "Gadvi");
        Assertions.assertFalse(manish.equals("Manish"));
    }

    @Test
    @DisplayName("check Spartan against another spartan with same names")
    void checkASpartanAgainstAnotherSpartanWithSameNames() {
        Spartan manish = new Spartan("Manish", "Gadvi");
        Spartan alex = new Spartan("Manish", "Gadvi");
        Assertions.assertTrue(manish.equals(alex));
    }

}
