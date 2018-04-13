package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lsalvatierra on 4/12/2018.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(
            method = RequestMethod.GET
    )
    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(
            method = RequestMethod.POST
    )
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }

}
