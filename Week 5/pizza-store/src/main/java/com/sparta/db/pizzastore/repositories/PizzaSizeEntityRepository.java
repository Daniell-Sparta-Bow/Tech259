package com.sparta.db.pizzastore.repositories;

import com.sparta.db.pizzastore.entities.PizzaSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PizzaSizeEntityRepository extends JpaRepository<PizzaSizeEntity, Integer> {

    @Query(value = "SELECT * FROM pizza_sizes WHERE size_name = ?1", nativeQuery = true)
    List<PizzaSizeEntity> findSizesByName(String sizeName);

    Optional<PizzaSizeEntity> findFirstById(int id); // Spring Expression Syntax
}