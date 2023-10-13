package com.pojectbank.dto;

import lombok.Data;

@Data
public class TransactionDto {
    String id;
    String debit_account_id;
    String credit_account_id;
    String type;
    String amount;
    String description;
    String date;

}
