package com.projectbank.mapper;

import com.projectbank.dto.ManagerDto;
import com.projectbank.entity.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ManagerMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "createdAt", target = "data")
    ManagerDto managerToDto(Manager manager);
}
