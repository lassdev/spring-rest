/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lsalvatierra
 */
@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;
    
    public Employee getById(Long id){
        return repository.findById(id).get();
    }
    
}
