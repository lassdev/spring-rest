/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.report;

/**
 *
 * @author lsalvatierra
 */
public class EmployeeReport {
    
    private Long id;
    private String firsName;
    private String lastName;

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
     * @return the firsName
     */
    public String getFirsName() {
        return firsName;
    }

    /**
     * @param firsName the firsName to set
     */
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   
    
}
