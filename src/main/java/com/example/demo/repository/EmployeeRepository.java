package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * @autor lsalvatierra on 4/12/2018.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
