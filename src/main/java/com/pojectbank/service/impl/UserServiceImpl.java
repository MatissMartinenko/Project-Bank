package com.pojectbank.service.impl;

import com.pojectbank.entity.User;
import com.pojectbank.repository.UserRepository;
import com.pojectbank.service.UserService;
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
