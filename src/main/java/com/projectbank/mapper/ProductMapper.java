package com.projectbank.mapper;

import com.projectbank.dto.ProductDto;
import com.projectbank.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "currencyCode", target = "currency")
    @Mapping(source = "interestRate", target = "rate")
    ProductDto productToDto(Product product);
}
