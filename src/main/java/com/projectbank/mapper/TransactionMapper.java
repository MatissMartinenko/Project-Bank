package com.projectbank.mapper;

import com.projectbank.dto.TransactionDto;
import com.projectbank.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "debitAccount.id", target = "debit_account_id")
    @Mapping(source = "creditAccount.id", target = "credit_account_id")
    @Mapping(source = "type", target = "type")
    @Mapping(source = "amount", target = "amount")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "createdAt", target = "date")
    TransactionDto transactionToDto(Transaction transaction);
}
