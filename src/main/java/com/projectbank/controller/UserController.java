package com.projectbank.controller;

import com.projectbank.dto.UserDto;
import com.projectbank.entity.User;
import com.projectbank.mapper.UserMapper;
import com.projectbank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/get/{id}")
    public UserDto getUser(@PathVariable("id") String id) {
        Optional<User> opt = userService.findById(id);
        if (opt.isPresent()) {
            return userMapper.userToDto(opt.get());
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}