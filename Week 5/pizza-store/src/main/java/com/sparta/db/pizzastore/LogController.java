package com.sparta.db.pizzastore;


import com.sparta.db.logging.LoggingUtil;
import org.springframework.boot.CommandLineRunner;

import java.util.logging.Logger;

public class LogController implements CommandLineRunner {
    private static Logger LOGGER = Logger.getLogger(LogController.class.getName());


    @Override
    public void run(String... args) throws Exception {
        LoggingUtil.setUp(LOGGER);
    }
}
