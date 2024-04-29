package com.sparta.db.tdd;

import com.sparta.db.logging.LoggerUtil;

import java.io.IOException;
import java.util.logging.Logger;

public class FizzBuzz {

    private static final Logger LOGGER = Logger.getLogger(FizzBuzz.class.getName());
    static {
        try {
            LoggerUtil.setUp(LOGGER);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getFizzBuzz(int value) {
        LOGGER.info("getFizzBuzz starts");
        boolean divisibleBy3 = value % 3 == 0;
        LOGGER.config("divisibleBy3 is set to: " + divisibleBy3);
        boolean divisibleBy5 = value % 5 == 0;
        LOGGER.config("divisibileBy5 is set to: " + divisibleBy5);
        boolean divisibleBy3and5 = divisibleBy5 && divisibleBy3;
        LOGGER.config("divisibleBy3and5 is set to: " + divisibleBy3and5);


        if (divisibleBy3and5){
            LOGGER.info("getFizzBuzz returns FizzBuzz");
            return "FizzBuzz";
        } else if (divisibleBy5) {
            LOGGER.info("getFizzBuzz returns Buzz");
            return "Buzz";
        } else if (divisibleBy3) {
            LOGGER.info("getFizzBuzz returns Fizz");
            return "Fizz";
        } else {
            LOGGER.info("getFizzBuzz returns " + value);
            return String.valueOf(value);
        }
    }
}
