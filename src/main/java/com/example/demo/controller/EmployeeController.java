package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lsalvatierra on 4/12/2018.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(
            method = RequestMethod.POST
    )
    @ResponseBody
    public Employee add(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
