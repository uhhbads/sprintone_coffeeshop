package com.coffeeshop.repository;

import com.coffeeshop.model.CoffeeOrder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CoffeeOrderRepository {
    private List<CoffeeOrder> coffeeOrders = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public CoffeeOrder save(CoffeeOrder order){
        if(order.getId() == null){
            order.setId(idGenerator.getAndIncrement());
            coffeeOrders.add(order);
        } else {
            deleteById(order.getId());
            coffeeOrders.add(order);
        }
        return order;
    }

    public CoffeeOrder findById(Long id){
        CoffeeOrder foundOrder =

        return foundOrder;
    }

    public List<CoffeeOrder> findAll(){
        return new ArrayList<>(coffeeOrders);
    }
}
