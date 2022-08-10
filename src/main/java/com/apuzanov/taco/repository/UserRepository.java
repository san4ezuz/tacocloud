package com.apuzanov.taco.repository;

import com.apuzanov.taco.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
