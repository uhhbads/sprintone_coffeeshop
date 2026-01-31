package com.coffeeshop.repository;

import com.coffeeshop.model.CoffeeOrder;

import java.util.List;
import java.util.Optional;

public interface CoffeeOrderRepository {
    CoffeeOrder save(CoffeeOrder order);
    Optional<CoffeeOrder> findById(Long id);
    List<CoffeeOrder> findAll();
    void deleteById(Long id);
}
