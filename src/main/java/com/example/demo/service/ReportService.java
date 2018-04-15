/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Contract;
import com.example.demo.model.Employee;
import com.example.demo.model.report.ContractReport;
import com.example.demo.model.report.EmployeeReport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lsalvatierra
 */
@Service
public class ReportService {
    
    @Autowired
    private ContractService contractService;
    
    @Autowired
    private EmployeeService employeeService;
    
    public List<ContractReport> getContractsByInitDateBetween(Date startDate, Date endDate){
        
        List<ContractReport> contractItems = new ArrayList<>();
        List<Contract> contracts =  contractService.getByInitDateBetween(startDate, endDate);
        contracts.forEach(
                c -> contractItems.add(mapToContractReport(c, employeeService.getById(c.getEmployeeId())))
        );
        return contractItems;
    }
    
    private ContractReport mapToContractReport(Contract contract, Employee employee){
        
        EmployeeReport empReport = new EmployeeReport();
        empReport.setFirsName(employee.getFirstName());
        empReport.setLastName(employee.getLastName());
        empReport.setId(employee.getId());
        
        ContractReport contractReport  = new ContractReport();
        contractReport.setId(contract.getId());
        contractReport.setInitDate(contract.getInitDate());
        contractReport.setEndDate(contract.getEndDate());
        contractReport.setEmployee(empReport);
        
        return contractReport;
        
    }
    
}
