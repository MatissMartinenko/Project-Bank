package com.pojectbank.controller;

import com.pojectbank.dto.AccountDto;
import com.pojectbank.entity.Account;
import com.pojectbank.mapper.AccountMapper;
import com.pojectbank.service.AccountService;
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
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    @GetMapping("/get/{id}")
    public AccountDto getAccount(@PathVariable("id") String id){
        Optional<Account> opt = accountService.findById(id);

        if (opt.isPresent()){
            return accountMapper.accountToDto(opt.get());
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
