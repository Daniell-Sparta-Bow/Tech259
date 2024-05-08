package com.sparta.db.pizzastore.repositories;

import com.sparta.db.pizzastore.entities.OrderEntity;
import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository                                                //Entity     -Entities Primary Key data type
public interface OrderEntityRepository extends JpaRepository<OrderEntity, Integer> {

    Optional<OrderEntity> findByCustomerName(String name);
}