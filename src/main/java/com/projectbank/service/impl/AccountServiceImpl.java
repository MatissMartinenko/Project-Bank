package com.projectbank.service.impl;

import com.projectbank.entity.Account;
import com.projectbank.repository.AccountRepository;
import com.projectbank.service.AccountService;
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
