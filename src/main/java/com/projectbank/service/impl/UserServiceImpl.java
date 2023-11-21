package com.projectbank.service.impl;

import com.projectbank.entity.User;
import com.projectbank.repository.UserRepository;
import com.projectbank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(UUID.fromString(id));
    }
}
