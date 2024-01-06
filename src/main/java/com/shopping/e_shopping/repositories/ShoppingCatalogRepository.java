package com.shopping.e_shopping.repositories;

import com.shopping.e_shopping.entities.Catalog;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCatalogRepository extends CrudRepository<Catalog,Integer> {
}
