package com.gobarber.backend.spring.service;

import com.gobarber.backend.spring.model.User;
import com.gobarber.backend.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return this.userRepository.findById(id);
    }

    @Override
    public User findByEmail(String email) {
        return this.userRepository.findUserByEmail(email);
    }

    @Override
    public Iterable<User> findAll() {
        return this.userRepository.findAll();
    }
}
