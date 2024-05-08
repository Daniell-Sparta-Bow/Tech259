package com.sparta.db.pizzastore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetailEntity {
    @EmbeddedId
    private OrderDetailEntityId id;

    @Column(name = "quantity")
    private Integer quantity;

    public OrderDetailEntityId getId() {
        return id;
    }

    public void setId(OrderDetailEntityId id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" +
                "id=" + id +
                ", quantity=" + quantity +
                '}';
    }
}