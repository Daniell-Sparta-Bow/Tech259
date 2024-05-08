package com.sparta.db.pizzastore;

import com.sparta.db.logging.LoggingUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.logging.Logger;

@SpringBootApplication
public class PizzaStoreApplication {
    private static final Logger LOGGER = Logger.getLogger(PizzaStoreApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(PizzaStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){

        try {
            LoggingUtil.setUp(LOGGER);
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return args -> LOGGER.info("Hello World");
    }
}
