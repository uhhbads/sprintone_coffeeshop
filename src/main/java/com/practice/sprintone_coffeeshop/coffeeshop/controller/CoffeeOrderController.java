package com.practice.sprintone_coffeeshop.coffeeshop.controller;

import com.practice.sprintone_coffeeshop.coffeeshop.model.CoffeeOrder;
import com.practice.sprintone_coffeeshop.coffeeshop.service.CoffeeOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/orders")
public class CoffeeOrderController {
    private final CoffeeOrderService coffeeOrderService;

    public CoffeeOrderController(CoffeeOrderService coffeeOrderService) {
        this.coffeeOrderService = coffeeOrderService;
    }

    @PostMapping
    public CoffeeOrder createNewCoffeeOrder(
            @RequestBody CoffeeOrder coffeeOrder){
        return coffeeOrderService.createOrder(
                coffeeOrder.getCustomerName(),
                coffeeOrder.getCoffeeSize());
    }

    @GetMapping
    public List<CoffeeOrder> listAllOrders(){
        return coffeeOrderService.getAllOrders();
    }

    @GetMapping("{id}")
    public Optional<CoffeeOrder> getOrderById(Long id){
        return coffeeOrderService.getOrderById(id);
    }

    @GetMapping("/revenue")
    public double getTotalRevenue(){
        return coffeeOrderService.calculateTotalRevenue();
    }
}
