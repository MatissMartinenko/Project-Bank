package com.pojectbank.dto;

import lombok.Data;

@Data
public class AccountDto {
    String id;
    String name;
    String type;
    String status;
    String balance;
    String currencyCode;
    String date;
}
