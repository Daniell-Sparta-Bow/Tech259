package com.sparta.db.mocking;

import com.sparta.db.advanced_unit_testing.Spartan;
import org.junit.jupiter.api.*;
import org.mockito.InOrder;

import org.mockito.Mockito;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SpartanDAOTests {
    private static Spartan mockSpartan;
    private static Spartan spySpartan;

    @BeforeAll
    static void setupAll(){

        Spartan manish = new Spartan(1, "Manish", "Java", LocalDate.now());
        spySpartan = Mockito.spy(manish);

    }

    @BeforeEach
    void setup(){
        mockSpartan = Mockito.mock(Spartan.class);
        SpartanDAO.addSpartan(mockSpartan);
    }

    @AfterEach
    void tearDown(){
        SpartanDAO.getSpartans().remove(0);

    }

    @Test
    @DisplayName("check that the DAO prints all spartans")
    void checkThatTheDaoPrintsAllSpartans() {
        Mockito.when(mockSpartan.toString()).thenReturn("Found mock Spartan");
        Assertions.assertEquals("Found mock Spartan" +"\n", SpartanDAO.getAllSpartans());
    }

    @Test
    @DisplayName("Testing mock method order")
    void testingMockMethodOrder() {
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.MAX);

        System.out.println(mockSpartan.getStartDate());
        System.out.println(mockSpartan.getStartDate());
    }

    @Test
    @DisplayName("Test that the getID method is called on our mock")
    void testThatTheGetIdMethodIsCalledOnOurMock() {
        boolean present = SpartanDAO.findSpartan(1).isPresent();
        Mockito.verify(mockSpartan, Mockito.times(1)).getId();
    }

    @Test
    @DisplayName("Testing the order of methods on a mock object")
    void testingTheOrderOfMethodsOnAMockObject() {
        mockSpartan.setName("Alex");
        mockSpartan.setCourse("C#");
        System.out.println(mockSpartan.getName() + " " + mockSpartan.getCourse());

        InOrder inOrder = Mockito.inOrder(mockSpartan);
        inOrder.verify(mockSpartan).setName("Alex");
        inOrder.verify(mockSpartan).setCourse("C#");
        inOrder.verify(mockSpartan).getName();
        inOrder.verify(mockSpartan).getCourse();
    }

    @Test
    @DisplayName("testing that remove spartan calls the getId method")
    void testingThatRemoveSpartanCallsTheGetIdMethod() {

        SpartanDAO.removeSpartan(1);
        Mockito.verify(mockSpartan).getId();
    }
}
