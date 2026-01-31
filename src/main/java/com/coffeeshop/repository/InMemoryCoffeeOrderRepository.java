package com.coffeeshop.repository;

import com.coffeeshop.model.CoffeeOrder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryCoffeeOrderRepository implements CoffeeOrderRepository{
    private final List<CoffeeOrder> coffeeOrders = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
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

    @Override
    public Optional<CoffeeOrder> findById(Long id){
        return coffeeOrders.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<CoffeeOrder> findAll(){
        return new ArrayList<>(coffeeOrders);
    }

    @Override
    public void deleteById(Long id){
        coffeeOrders.removeIf(o -> o.getId().equals(id));
    }
}
