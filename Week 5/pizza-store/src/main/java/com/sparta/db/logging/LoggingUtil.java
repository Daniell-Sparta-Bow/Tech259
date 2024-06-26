package com.sparta.db.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingUtil {

    private static final Level loggerLevel = Level.ALL;
    private static final Level consoleLevel = Level.INFO;
    private static final Level fileLevel = Level.INFO;

    public static void setUp(Logger logger){
        ConsoleHandler consoleHandler = getConsoleHandler();
        FileHandler fileHandler = getFileHandler();
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);
        logger.setLevel(loggerLevel);
        logger.info("Logger Initialized");
    }

    private static ConsoleHandler getConsoleHandler() {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        ;
        consoleHandler.setLevel(consoleLevel);
        return consoleHandler;
    }

    private static FileHandler getFileHandler(){

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("src/main/resources/debug.log", false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        fileHandler.setLevel(fileLevel);
        return fileHandler;
    }

}
