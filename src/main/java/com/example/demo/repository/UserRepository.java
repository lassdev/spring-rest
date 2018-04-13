package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lsalvatierra on 4/12/2018.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}
