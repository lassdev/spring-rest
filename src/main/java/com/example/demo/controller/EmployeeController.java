package com.example.demo.controller;

import com.example.demo.model.Contract;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import java.util.Optional;
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
            method = RequestMethod.GET
    )
    public Iterable<Employee> findAllEmployes(){
        return employeeRepository.findAll();
    }
    
    
    @RequestMapping(
            method = RequestMethod.POST
    )
    @ResponseBody
    public Employee add(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/{employeeId}/contracts"
    )
    @ResponseBody
    public void addContract(@PathVariable Long employeeId, @RequestBody Contract contract ) {
        Optional<Employee> emp = employeeRepository.findById(employeeId);
        if(emp.isPresent()){
            Employee item = emp.get();
            contract.setEmployee(item);
            item.getContracts().add(contract);
            
            employeeRepository.save(item);
        }
        
    }
    
}
