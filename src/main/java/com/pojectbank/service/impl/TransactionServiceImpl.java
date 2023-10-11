package com.pojectbank.service.impl;

import com.pojectbank.entity.Transaction;
import com.pojectbank.repository.TransactionRepository;
import com.pojectbank.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;


    @Override
    public Optional<Transaction> findById(String id) {
        return transactionRepository.findById(UUID.fromString(id));
    }
}
