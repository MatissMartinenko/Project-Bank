package com.projectbank.mapper;

import com.projectbank.dto.AgreementDto;
import com.projectbank.entity.Agreement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel= "spring")
    public interface AgreementMapper {

        @Mapping(source = "id", target = "id")
        @Mapping(source = "status", target = "status")
        @Mapping(source = "sum", target = "sum")
        @Mapping(source = "createdAt", target = "date")
        AgreementDto agreementToDto(Agreement agreement);
}
