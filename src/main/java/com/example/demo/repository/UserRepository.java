package com.example.demo.repository;

import com.example.demo.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lsalvatierra on 4/12/2018.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByFirstName(String name);
    List<User> findByEmail(String email);
}
