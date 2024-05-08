package com.sparta.db.pizzastore.repositories;

import com.sparta.db.pizzastore.entities.OrderDetailEntity;
import com.sparta.db.pizzastore.entities.OrderDetailEntityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailEntityRepository extends JpaRepository<OrderDetailEntity, OrderDetailEntityId> {
}