package com.sparta.db.pizzastore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Something Spring can create via Dependency injection
// Inversion of Control Container (IoC)
public class CustomCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Hello from the Custom Command Line Runner");
    }
}
