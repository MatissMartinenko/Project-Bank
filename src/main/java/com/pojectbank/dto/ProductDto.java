package com.pojectbank.dto;

import lombok.Data;

@Data
public class ProductDto {

    String id;
    String name;
    String status;
    String currency; //enum
    String rate;
    String date;

}
