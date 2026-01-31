package com.practice.sprintone_coffeeshop.coffeeshop.service;

import com.practice.sprintone_coffeeshop.coffeeshop.model.CoffeeOrder;
import com.practice.sprintone_coffeeshop.coffeeshop.repository.CoffeeOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeOrderService {
    private final CoffeeOrderRepository coffeeOrderRepository;

    public CoffeeOrderService(CoffeeOrderRepository coffeeOrderRepository){
        this.coffeeOrderRepository = coffeeOrderRepository;
    }

    private double calculatePrice(String size){
        return switch(size.toLowerCase()){
            case "tall" -> 100.00;
            case "grande" -> 180.00;
            case "venti" -> 220.00;
            default -> throw new IllegalArgumentException("Invalid size: " + size);
        };
    }

    public CoffeeOrder createOrder(String name, String size){
        double price = calculatePrice(size);

        CoffeeOrder order = new CoffeeOrder(name, size, price);

        return coffeeOrderRepository.save(order);
    }

    public List<CoffeeOrder> getAllOrders(){
        return coffeeOrderRepository.findAll();
    }

    public Optional<CoffeeOrder> getOrderById(Long id){
        return coffeeOrderRepository.findById(id);
    }

    public double calculateTotalRevenue(){
        return coffeeOrderRepository.findAll()
                .stream().mapToDouble(CoffeeOrder::getPrice)
                .sum();
    }
}
