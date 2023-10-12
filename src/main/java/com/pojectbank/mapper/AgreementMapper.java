package com.pojectbank.mapper;

import com.pojectbank.dto.AgreementDto;
import com.pojectbank.entity.Agreement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel= "spring")
    public interface AgreementMapper {

        @Mapping(source = "", target = "")
        @Mapping(source = "", target = "")
        @Mapping(source = "", target = "")
        @Mapping(source = "", target = "")
        AgreementDto agreementToDto(Agreement agreement);
}
