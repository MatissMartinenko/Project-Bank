package com.pojectbank.mapper;

import com.pojectbank.dto.UserDto;
import com.pojectbank.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "taxCode", target = "taxCode")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "phone", target = "phone")
    @Mapping(source = "createdAt", target = "date")

    UserDto userToDto(User user);
}
