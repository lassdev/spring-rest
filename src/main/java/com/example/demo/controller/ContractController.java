package com.example.demo.controller;

import com.example.demo.model.report.ContractReport;
import com.example.demo.service.ReportService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @autor lsalvatierra on 4/12/2018.
 */
@RestController
@RequestMapping("/contracts")
public class ContractController {
    
    @Autowired
    private ReportService reportService;
    //private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ContractReport> findAllEmployes(@RequestParam("startDate") 
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        
        return reportService.getContractsByInitDateBetween(startDate, endDate);
    }
}
