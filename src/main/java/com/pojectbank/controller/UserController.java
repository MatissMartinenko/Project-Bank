package com.pojectbank.controller;

import com.pojectbank.dto.UserDto;
import com.pojectbank.entity.Transaction;
import com.pojectbank.entity.User;
import com.pojectbank.mapper.UserMapper;
import com.pojectbank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
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
        System.out.println(id);
        if(opt.isPresent()){
            return userMapper.userToDto(opt.get());
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
}
}