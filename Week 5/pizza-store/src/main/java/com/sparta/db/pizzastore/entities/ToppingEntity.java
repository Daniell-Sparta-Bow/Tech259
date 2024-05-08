package com.sparta.db.pizzastore.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "toppings")
public class ToppingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topping_id", nullable = false)
    private Integer id;

    @Column(name = "topping_name", length = 50)
    private String toppingName;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}