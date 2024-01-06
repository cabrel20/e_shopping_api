package com.shopping.e_shopping.services;

import com.shopping.e_shopping.entities.User;
import com.shopping.e_shopping.repositories.ShoppingUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    public void setUserRepository(ShoppingUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private ShoppingUserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Iterable<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getSingleUser(Integer id){
        return userRepository.findById(id).orElseThrow();
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
