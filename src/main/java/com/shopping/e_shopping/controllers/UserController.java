package com.shopping.e_shopping.controllers;

import com.shopping.e_shopping.entities.User;
import com.shopping.e_shopping.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public void setUserServices(UserServices userServices) {
        this.userServices = userServices;
    }

    private UserServices userServices;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userServices.createUser(user);
    }

    @GetMapping("/")
    public Iterable<User> getAllUsers(){
        return userServices.getAllUser();
    }
}
