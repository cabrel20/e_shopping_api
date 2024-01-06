package com.shopping.e_shopping.repositories;

import com.shopping.e_shopping.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingProductRepository extends CrudRepository<Product,Integer> {
}
