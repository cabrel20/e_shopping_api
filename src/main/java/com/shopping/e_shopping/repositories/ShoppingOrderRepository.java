package com.shopping.e_shopping.repositories;

import com.shopping.e_shopping.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingOrderRepository extends CrudRepository<Order,Integer> {
}
