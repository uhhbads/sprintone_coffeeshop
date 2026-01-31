package com.practice.sprintone_coffeeshop.coffeeshop.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Setter
@Getter
public class CoffeeOrder {
    private Long id;
    private String customerName;
    private String coffeeSize;
    private Double price;
    private LocalDateTime orderTime;

    public CoffeeOrder(){}

    public CoffeeOrder(Long id, String customerName, String coffeeSize, Double price, LocalDateTime orderTime) {
        this.id = id;
        this.customerName = customerName;
        this.coffeeSize = coffeeSize;
        this.price = price;
        this.orderTime = orderTime;
    }

    public CoffeeOrder(String customerName, String coffeeSize, double price) {
        this.customerName = customerName;
        this.coffeeSize = coffeeSize;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeOrder that = (CoffeeOrder) o;
        return Objects.equals(id, that.id) && Objects.equals(customerName, that.customerName) && Objects.equals(coffeeSize, that.coffeeSize) && Objects.equals(price, that.price) && Objects.equals(orderTime, that.orderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, coffeeSize, price, orderTime);
    }
}
