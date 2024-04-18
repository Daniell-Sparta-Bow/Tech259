package com.sparta.db.enums_kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class ATMTests {

    @Test
    @DisplayName("Given an input of Money.ONE and 0 to setATMBillCount, atm.get(Money.ONE) returns 0")
    void givenAnInputOfMoneyONEAnd0_atmGet_MoneyONE_returns_0(){
        // Arrange
        ATM atm = new ATM();
        Money input1 = Money.ONE;
        int input2 = 0;

        // Act
        atm.setATMBillCount(input1, input2);
        int result = atm.getBillAmount(input1);

        // Assert
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Given an input of 1, withdraw() should return Money.ONE")
    void givenAnInputOf1_withdraw_returns_ONE() throws Exception {
        // Arrange
        ATM atm = new ATM();
        int input = 1;

        ArrayList<Money> expected = new ArrayList<>();
        expected.add(Money.ONE);

        // Act
        ArrayList<Money> result = atm.withdraw(input);


        // Assert
        Assertions.assertEquals(expected, result);


    }

    @Test
    @DisplayName("Given an input of 2, withdraw() returns a value of TWO")
    void givenAnInputOf2_withdraw_returns_TWO() throws Exception {
        // Arrange
        ATM atm = new ATM();
        int input = 2;

        ArrayList<Money> expected = new ArrayList<>();
        expected.add(Money.TWO);

        // Act
        ArrayList<Money> result = atm.withdraw(input);


        // Assert
        Assertions.assertEquals(expected, result);

    }
    @Test
    @DisplayName("Given an input of 3, withdraw() returns a value of [TWO, ONE]")
    void givenAnInputOf3_withdraw_returns_TWO_ONE() throws Exception {
        // Arrange
        ATM atm = new ATM();
        int input = 3;

        ArrayList<Money> expected = new ArrayList<>();
        expected.add(Money.TWO);
        expected.add(Money.ONE);

        // Act
        ArrayList<Money> result = atm.withdraw(input);


        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @DisplayName("Given an input of 3 and there are no 2 bills, withdraw() returns a value of [ONE, ONE, ONE] ")
    void givenAnInputOf3_AndTheresNo2Bills_withdraw_returns_THREE_ONES() throws Exception {
        // Arrange
        ATM atm = new ATM();
        atm.setATMBillCount(Money.TWO, 0);
        int input = 3;

        ArrayList<Money> expected = new ArrayList<>();
        expected.add(Money.ONE);
        expected.add(Money.ONE);
        expected.add(Money.ONE);

        // Act
        ArrayList<Money> result = atm.withdraw(input);


        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @DisplayName("Given an input of 1000, withdraw() returns [FIVE_HUNDRED, FIVE_HUNDRED]")
    void givenAnInputOf1000_withdraw_returns_TWO_FIVE_HUNDREDs() throws Exception {
        // Arrange
        ATM atm = new ATM();
        int input = 1000;
        ArrayList<Money> expected = new ArrayList<>();
        expected.add(Money.FIVE_HUNDRED);
        expected.add(Money.FIVE_HUNDRED);


        // Act
        ArrayList<Money> result = atm.withdraw(input);

        // Assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @DisplayName("Given an input of 10000, withdraw() throws an error")
    void givenAnInputOf10000_withdraw_throwsException() throws Exception {
        ATM atm = new ATM();
        int input = 10000;

        Exception exception = assertThrows(Exception.class, () -> atm.withdraw(input));

        Assertions.assertEquals("The ATM machine has not enough money, please go to the nearest atm machine", exception.getMessage());
    }
    
    @Test
    @DisplayName("Given an input of 1233, withdraw() returns ")
    void givenAnInputOf1233_withdraw_returns(){
        // Arrange
        ATM atm = new ATM();
        int input = 1233;
        ArrayList<Money> expected = new ArrayList<>();
        expected.add(Money.FIVE_HUNDRED);
        expected.add(Money.FIVE_HUNDRED);
        expected.add(Money.TWO_HUNDRED);
        expected.add(Money.TWENTY);
        expected.add(Money.TEN);
        expected.add(Money.TWO);
        expected.add(Money.ONE);
        // Act
        ArrayList<Money> result = new ArrayList<>();
        try {
            result = atm.withdraw(input);
        } catch (Exception e){

        }

        Assertions.assertEquals(expected, result);
        
        
    }
}
