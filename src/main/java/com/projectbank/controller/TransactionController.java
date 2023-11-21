package com.projectbank.controller;

import com.projectbank.dto.TransactionDto;
import com.projectbank.entity.Transaction;
import com.projectbank.mapper.TransactionMapper;
import com.projectbank.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    @GetMapping("/get/{id}")
    public TransactionDto getTransaction(@PathVariable("id") String id) {
        Optional<Transaction> opt = transactionService.findById(id);

        if (opt.isPresent()){
            return transactionMapper.transactionToDto(opt.get());
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
