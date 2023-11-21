package com.projectbank.service;


import com.projectbank.entity.Transaction;

import java.util.Optional;

public interface TransactionService {
    Optional<Transaction> findById(String id);
}
