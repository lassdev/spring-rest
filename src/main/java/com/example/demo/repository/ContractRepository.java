package com.example.demo.repository;

import com.example.demo.model.Contract;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * @autor by lsalvatierra on 4/12/2018.
 */
public interface ContractRepository extends CrudRepository<Contract, Long> {
    
    //@Query("SELECT c FROM Contract c where t.title = ?1 AND t.description = ?2")
    public List<Contract> findByInitDateBetween(Date startDate, Date endDate);
}
