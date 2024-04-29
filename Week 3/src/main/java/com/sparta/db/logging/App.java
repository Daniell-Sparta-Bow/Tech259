package com.sparta.db.logging;

import java.io.IOException;
import java.util.logging.*;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException {
        LOGGER.setUseParentHandlers(false);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        FileHandler fileHandler = new FileHandler("src/main/resources/logFile.log", false);
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFilter(new CustomFilter());
        fileHandler.setFormatter(new XMLFormatter());
        consoleHandler.setFormatter(new CustomFormatter());

        LOGGER.addHandler(consoleHandler);
        LOGGER.addHandler(fileHandler);

        LOGGER.setLevel(Level.ALL);
        LOGGER.log(Level.SEVERE, "Hello this is a severe message");
        LOGGER.log(Level.WARNING, "This is a warning message");
        LOGGER.log(Level.INFO, "This is an info message");
        LOGGER.log(Level.CONFIG, "This is a config message");
        LOGGER.log(Level.FINE, "This is a fine message");
        LOGGER.log(Level.FINE, "This is a fine message");


    }
}
