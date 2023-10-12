package com.pojectbank.service;

import com.pojectbank.entity.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> findById(String id);
}
