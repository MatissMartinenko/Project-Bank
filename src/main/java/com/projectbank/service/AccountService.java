package com.projectbank.service;

import com.projectbank.entity.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> findById(String id);
}
