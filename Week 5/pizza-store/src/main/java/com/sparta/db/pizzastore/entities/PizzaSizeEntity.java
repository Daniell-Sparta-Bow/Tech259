package com.sparta.db.pizzastore.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "pizza_sizes")
public class PizzaSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id", nullable = false)
    private Integer id;

    @Column(name = "size_name", length = 50)
    private String sizeName;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}