package com.sparta.db.pizzastore.service;

import com.sparta.db.pizzastore.entities.OrderDetailEntity;
import com.sparta.db.pizzastore.entities.OrderEntity;
import com.sparta.db.pizzastore.entities.ToppingEntity;
import com.sparta.db.pizzastore.repositories.OrderDetailEntityRepository;
import com.sparta.db.pizzastore.repositories.OrderEntityRepository;
import com.sparta.db.pizzastore.repositories.PizzaSizeEntityRepository;
import com.sparta.db.pizzastore.repositories.ToppingEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PizzaStoreService {

    private static final Logger LOGGER = Logger.getLogger(PizzaStoreService.class.getName());

    private final OrderDetailEntityRepository orderDetailEntityRepository;
    private final OrderEntityRepository orderEntityRepository;
    private final ToppingEntityRepository toppingEntityRepository;

    @Autowired
    public PizzaStoreService(OrderDetailEntityRepository orderDetailEntityRepository, OrderEntityRepository orderEntityRepository, ToppingEntityRepository toppingEntityRepository) {
        this.orderDetailEntityRepository = orderDetailEntityRepository;
        this.orderEntityRepository = orderEntityRepository;
        this.toppingEntityRepository = toppingEntityRepository;
    }

    @Transactional
    public void getAllOrders(){
        List<OrderDetailEntity> allOrders = orderDetailEntityRepository.findAll();
        System.out.println(allOrders);
    }

    @Transactional
    public void getAllToppingsByCustomerName(String customerName){
        Optional<OrderEntity> orderEntity = orderEntityRepository.findByCustomerName(customerName);
        int customerId = 0;
        if(orderEntity.isPresent()){
            customerId = orderEntity.get().getId();
        }
        List<OrderEntity> allOrders = orderEntityRepository.findAllById(Collections.singleton(customerId));
        LOGGER.info(allOrders.toString());
    }


}
