package com.projectbank.dto;

import lombok.Data;

@Data
public class UserDto {
    String id;
    String status;
    String firstName;
    String lastName;
    String taxCode;
    String email;
    String address;
    String phone;
    String date;
}
