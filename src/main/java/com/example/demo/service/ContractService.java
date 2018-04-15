/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Contract;
import com.example.demo.repository.ContractRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lsalvatierra
 */
@Service
public class ContractService {
    
    @Autowired
    private ContractRepository contractRepository;
    
    public List<Contract> getByInitDateBetween(Date startDate, Date endDate){
        
        return contractRepository.findByInitDateBetween(startDate, endDate);
    }
    
}
