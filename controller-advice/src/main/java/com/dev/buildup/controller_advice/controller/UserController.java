package com.dev.buildup.controller_advice.controller;

import com.dev.buildup.controller_advice.exception_handler.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        if (id != 1) {
            throw new UserNotFoundException("User with ID " + id + " not found.");
        } else {
            return "User with ID " + id;
        }
    }
}
