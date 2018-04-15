package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Iterable<User> findAllUsers(@RequestParam(value = "email", required = false) String email){
        //if(null == email){
            return userRepository.findAll();
        //}
        
        //return userRepository.findByEmail(email);
        
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public User readUserById(@PathVariable Long userId) {
		
        return this.userRepository.findById(userId).get();
    }
 
    @RequestMapping(
            method = RequestMethod.POST
    )
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }
    
    
    
}
