package com.pojectbank.service.impl;

import com.pojectbank.entity.Account;
import com.pojectbank.repository.AccountRepository;
import com.pojectbank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Optional<Account> findById(String id) {
        return accountRepository.findById(UUID.fromString(id));
    }
}
