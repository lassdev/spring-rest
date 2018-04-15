/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.report;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lsalvatierra
 */
public class ContractReport {
    
    private static SimpleDateFormat dateFormat
      = new SimpleDateFormat("yyyy-MM-dd");
 
    private Long id;
 
    private Date  initDate;
 
    private Date endDate;
 
    private EmployeeReport employee;

    /**
     * @return the dateFormat
     */
    public static SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * @param aDateFormat the dateFormat to set
     */
    public static void setDateFormat(SimpleDateFormat aDateFormat) {
        dateFormat = aDateFormat;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the initDate
     */
    public Date getInitDate() {
        return initDate;
    }

    /**
     * @param initDate the initDate to set
     */
    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the employee
     */
    public EmployeeReport getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(EmployeeReport employee) {
        this.employee = employee;
    }
}
