package com.sparta.db.pizzastore;

import com.sparta.db.logging.LoggingUtil;
import com.sparta.db.pizzastore.repositories.OrderEntityRepository;
import com.sparta.db.pizzastore.repositories.PizzaSizeEntityRepository;
import com.sparta.db.pizzastore.service.PizzaStoreService;
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
    public CommandLineRunner runner(OrderEntityRepository orderEntityRepository, PizzaSizeEntityRepository pizzaSizeEntityRepository, PizzaStoreService pizzaStoreService){

        LoggingUtil.setUp(LOGGER);

        return args -> {
            LOGGER.info(orderEntityRepository.findAll().toString());  // Repositories have 2 return types: 1: List<OrderEntity>
            LOGGER.info(orderEntityRepository.findById(1).toString());//                                   2: Optional<OrderEntity>

            pizzaStoreService.getAllToppingsByCustomerName("John Doe");
        };
    }

    // v IoC -> Create an object from CommandLineRunner Interface -> in order to do that, I need v
    // OrderEntityRepository object -> This is called Injecting (Injecting OrderEntityRepository object into CommandLineRunner
}
