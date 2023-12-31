package com.projectbank.service.impl;

import com.projectbank.entity.Transaction;
import com.projectbank.repository.TransactionRepository;
import com.projectbank.service.TransactionService;
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
