package com.sparta.db.file_io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ExceptableTests {
    @Test
    @DisplayName("given an input less than 0 is provided to printIndexAt, an IllegalArgumentException is thrown")
    void givenAnInputLessThan0IsProvidedToPrintIndexAtAnIllegalArgumentExceptionIsThrown() {

        ArrayList<Integer> intArray = new ArrayList<>(){};
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);

        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> Exceptable.printItemAt(-3, intArray));
    }

    @Test
    @DisplayName("given an input greater than the size of intArray is provided to printIndexAt, an ArrayIndexOutOfBoundsException is thrown")
    void givenAnInputGreaterThanTheSizeOfIntArrayIsProvidedToPrintIndexAtAnArrayIndexOutOfBoundsExceptionIsThrown() {

        ArrayList<Integer> intArray = new ArrayList<>(){};
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);

        Assertions.assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> Exceptable.printItemAt(4, intArray));

    }

    @Test
    @DisplayName("given an input is within an acceptable range for intArray, no Exception is thrown")
    void givenAnInputIsWithinAnAcceptableRangeForIntArrayNoExceptionIsThrown() {
        ArrayList<Integer> intArray = new ArrayList<>(){};
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);

        Assertions.assertDoesNotThrow(() -> Exceptable.printItemAt(2, intArray));

    }
}
