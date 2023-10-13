package com.pojectbank.mapper;

import com.pojectbank.dto.AccountDto;
import com.pojectbank.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "type", target = "type")
    @Mapping(source = "accountStatus", target = "status")
    @Mapping(source = "balance", target = "balance")
    @Mapping(source = "currencyCode", target = "currencyCode")
    @Mapping(source = "createdAt", target = "date")
    AccountDto accountToDto(Account account);
}
