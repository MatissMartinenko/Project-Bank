package com.pojectbank.service;

import com.pojectbank.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findById(String id);
}
