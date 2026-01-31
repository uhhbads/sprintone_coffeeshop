package com.practice.sprintone_coffeeshop.coffeeshop.repository;

import com.practice.sprintone_coffeeshop.coffeeshop.model.CoffeeOrder;

import java.util.List;
import java.util.Optional;

public interface CoffeeOrderRepository {
    CoffeeOrder save(CoffeeOrder order);
    Optional<CoffeeOrder> findById(Long id);
    List<CoffeeOrder> findAll();
    void deleteById(Long id);
}
