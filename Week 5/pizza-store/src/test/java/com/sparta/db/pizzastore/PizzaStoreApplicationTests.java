package com.sparta.db.pizzastore;

import com.sparta.db.pizzastore.entities.OrderEntity;
import com.sparta.db.pizzastore.repositories.OrderEntityRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PizzaStoreApplicationTests {

    @Autowired // Field - create a bean of this type
    private OrderEntityRepository orderEntityRepository;


    @Test
    @DisplayName("Try and crash Spring!!!")
    void tryAndCrashSpring() {
        assertEquals("John Doe", orderEntityRepository.findById(1).get().getCustomerName());
    }

    @Test
    @DisplayName("Check that all orders are there")
    void checkThatAllOrdersAreThere() {
        int expectedSize = 3;
        assertEquals(expectedSize, orderEntityRepository.findAll().size());

    }

    @Test
    @DisplayName("Check that total count of orders is 3")
    void checkThatTotalCountOfOrdersIs3() {
        // Arrange
        int expectedSize = 3;
        // Act

        // Assert
        assertEquals(expectedSize, orderEntityRepository.count());

    }

    @Test
    @DisplayName("check that the price is right")
    void checkThatThePriceIsRight() {
        // Arrange

        // Act

        // Assert
        assertEquals(BigDecimal.valueOf(21.48), orderEntityRepository.findById(1).get().getTotalAmount());

    }


}
