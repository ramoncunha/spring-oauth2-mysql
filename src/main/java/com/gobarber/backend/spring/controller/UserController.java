package com.gobarber.backend.spring.controller;

import com.gobarber.backend.spring.model.User;
//import com.gobarber.backend.spring.repository.RoleRepository;
import com.gobarber.backend.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> findAll(){
        return this.userService.findAll();
    }

    @GetMapping("/id")
    public Optional<User> findById(@PathParam("id") Integer id){
        return this.userService.findById(id);
    }

    @PostMapping
    public User save(@Valid @RequestBody  User user){
        return this.userService.save(user);
    }
}
