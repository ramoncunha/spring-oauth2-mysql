package com.gobarber.backend.spring.service;

import com.gobarber.backend.spring.model.User;

import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> findById(Integer id);

    User findByEmail(String email);

    Iterable<User> findAll();

}
