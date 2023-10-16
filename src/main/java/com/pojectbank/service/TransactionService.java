package com.pojectbank.service;


import com.pojectbank.entity.Transaction;

import java.util.Optional;

public interface TransactionService {
    Optional<Transaction> findById(String id);
}
