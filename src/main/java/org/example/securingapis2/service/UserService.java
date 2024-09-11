package org.example.securingapis2.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(value = "users", key = "#userId")
    public String getUserById(Long userId) {
        // Simulate a call to the database
        return "User with ID: " + userId;
    }
}

