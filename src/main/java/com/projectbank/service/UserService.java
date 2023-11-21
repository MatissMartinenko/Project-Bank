package com.projectbank.service;

import com.projectbank.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(String id);
}
