package com.sparta.db.pizzastore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailEntityId implements Serializable {
    private static final long serialVersionUID = -3606109025471359172L;
    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "size_id", nullable = false)
    private Integer sizeId;

    @Column(name = "topping_id", nullable = false)
    private Integer toppingId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getToppingId() {
        return toppingId;
    }

    public void setToppingId(Integer toppingId) {
        this.toppingId = toppingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderDetailEntityId entity = (OrderDetailEntityId) o;
        return Objects.equals(this.sizeId, entity.sizeId) &&
                Objects.equals(this.orderId, entity.orderId) &&
                Objects.equals(this.toppingId, entity.toppingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeId, orderId, toppingId);
    }

}