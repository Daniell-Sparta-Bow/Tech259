package com.sparta.db.pizzastore.repositories;

import com.sparta.db.pizzastore.entities.ToppingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingEntityRepository extends JpaRepository<ToppingEntity, Integer> {
}