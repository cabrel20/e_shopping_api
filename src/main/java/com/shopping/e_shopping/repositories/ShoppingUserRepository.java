package com.shopping.e_shopping.repositories;

import com.shopping.e_shopping.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingUserRepository extends CrudRepository<User,Integer> {
}
